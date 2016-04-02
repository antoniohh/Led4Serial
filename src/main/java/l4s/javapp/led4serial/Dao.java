/*
 * Copyright (C) 2016 Antonio Horrillo Horrillo
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * Paquete led4serial.
 */
package l4s.javapp.led4serial;

/**
 * Importamos las librerías necesarias.
 */
import java.sql.*;
import java.util.ArrayList;
//import java.util.List;

/**
 * Aplicación Led4Serial para el control de un dispositivo Arduino.
 * 
 * @author Antonio Horrillo Horrillo
 */
public class Dao extends Sistema {

    /**
     * Atributos.
     */
    private Connection conn;
    private Statement stmt;
    private ResultSet rs;
    private ArrayList lista;
    //private List fila;
    //private int columnas;

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public Statement getStmt() {
        return stmt;
    }

    public void setStmt(Statement stmt) {
        this.stmt = stmt;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public ArrayList getLista() {
        return lista;
    }

    public void setLista(ArrayList lista) {
        this.lista = lista;
    }

    //public List getFila() {
    //     return fila;
    //}

    //public void setFila(List fila) {
    //    this.fila = fila;
    //}

    //public int getColumnas() {
    //    return columnas;
    //}
    
    //public void setColumnas(int columnas) {
    //    this.columnas = columnas;
    //}
   
    /**
     * 
     */
    public Dao() {
        super();
    }
    
    /**
     * 
     */
    public void crearDB() {
        try {
            Class.forName("org.sqlite.JDBC");
            this.conn = DriverManager.getConnection("jdbc:sqlite:"+this.getDbFile());
            this.stmt = this.conn.createStatement();
            this.stmt.close();
            this.conn.close();
            System.out.println("Base de Datos creada correctamente.");
        }
        catch ( ClassNotFoundException | SQLException e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.out.println("No se ha podido crear la base de datos.");
        }
    }    

    /**
     * crearTabla()
     * 
     * Crea la tabla "MENSAJES" si no existe.
     */
    public void crearTabla() {
        try {
            Class.forName("org.sqlite.JDBC");
            this.conn = DriverManager.getConnection("jdbc:sqlite:"+this.getDbFile());
            this.stmt = this.conn.createStatement();  
            System.out.println("Conexión a la base de Datos realizada correctamente.");
            String sql = "CREATE TABLE IF NOT EXISTS MENSAJES " +
                         "(ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                         " MSG TEXT NOT NULL)"; 
            this.stmt.executeUpdate(sql);
            this.stmt.close();
            this.conn.close();
            System.out.println("Tabla creada correctamente.");
        }
        catch ( ClassNotFoundException | SQLException e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.out.println("No se ha podido crear la tabla.");
        }
    }

    /**
     * 
     * @param msg 
     */
    public void insertarMensaje(String msg) {
        try {
            Class.forName("org.sqlite.JDBC");
            this.conn = DriverManager.getConnection("jdbc:sqlite:"+this.getDbFile());
            System.out.println("Conexión a la base de Datos realizada correctamente.");
            this.conn.setAutoCommit(false);
            this.stmt = this.conn.createStatement();
            String sql = "INSERT INTO MENSAJES (MSG) " +
                         "VALUES ('"+msg+"');"; 
            this.stmt.executeUpdate(sql);
            this.stmt.close();
            this.conn.commit();
            this.conn.close();
            System.out.println("Datos insertados en la tabla correctamente.");
        }
        catch ( ClassNotFoundException | SQLException e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.out.println("No se ha podido insertar los datos en la tabla.");
        }
    }

    public ArrayList leerMensaje() {       
        try {
            Class.forName("org.sqlite.JDBC");
            this.conn = DriverManager.getConnection("jdbc:sqlite:"+this.getDbFile());
            System.out.println("Conexión a la base de Datos realizada correctamente.");
            this.conn.setAutoCommit(false);
            this.stmt = this.conn.createStatement();
            this.rs = this.stmt.executeQuery( "SELECT * FROM MENSAJES;" );           
            //this.columnas = this.rs.getMetaData().getColumnCount();
            this.lista = new ArrayList<>();
            while (this.rs.next()) {
                //this.fila = new ArrayList<>(this.columnas);
                //for (int i=1; i<= this.columnas; i++) {
                //    this.fila.add(this.rs.getString(i));
                //}
                //this.lista.add(this.fila);
                this.lista.add(this.rs.getString("MSG"));
            }            
            this.rs.close();
            this.stmt.close();
            this.conn.close();
            System.out.println("Datos leidos de la tabla correctamente.");            
        }
        catch ( ClassNotFoundException | SQLException e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.out.println("No se ha podido leer los datos de la tabla.");
        }
        return this.lista;
    }
}