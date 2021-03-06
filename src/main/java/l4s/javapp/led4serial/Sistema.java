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
import java.io.File;

/**
 * Aplicación Led4Serial para el control de un dispositivo Arduino.
 * 
 * @author Antonio Horrillo Horrillo
 */
public class Sistema {

    /**
     * Atributos privados.
     */
    private String sistema;
    private String arquitectura;
    private String usuRuta;
    private String javaRuta;
    private String sepRuta;
    private String dbRuta;
    private File tempFile;
    private String actRuta;
    private String dbFile;    
    
    /**
     * Constructor de clase que inicializa los atributos a los valores del sistema.
     */
    public Sistema() {        
        this.sistema = System.getProperty("os.name");
        this.arquitectura = System.getProperty("os.arch");
        this.usuRuta = System.getProperty("user.dir");
        this.javaRuta = System.getProperty("java.home");
        this.sepRuta = System.getProperty("file.separator");
        this.tempFile = new File (".");
        this.actRuta = tempFile.getAbsolutePath();
        this.dbRuta = this.actRuta+this.sepRuta+"db";
        this.dbFile = this.actRuta+this.sepRuta+"db"+this.sepRuta+"arduino.db";
    }

    /**
     * Constructor de clase que inicializa los atributos a los valores 
     * indicados por los parámetros.
     * 
     * @param sistema
     * @param arquitectura
     * @param usuRuta
     * @param javaRuta
     * @param sepRuta
     * @param dbRuta
     * @param actRuta
     * @param tempFile
     * @param dbFile
     */
    public Sistema(String sistema, String arquitectura, String usuRuta, 
            String javaRuta, String sepRuta, String dbRuta, String actRuta, 
            File tempFile, String dbFile) {
        this.sistema = sistema;
        this.arquitectura = arquitectura;
        this.usuRuta = usuRuta;
        this.javaRuta = javaRuta;
        this.sepRuta = sepRuta;
        this.dbRuta = dbRuta;
        this.tempFile = tempFile;
        this.actRuta = actRuta;
    }
    
    /**
     * Metodo get para obtener (leer) el atributo.
     * @return 
     */
    public String getDbFile() {
        return dbFile;
    }

    /**
     * Metodo set para asignar (almacenar) el atributo. 
     * @param dbFile 
     */
    public void setDbFile(String dbFile) {
        this.dbFile = dbFile;
    }
    
    /**
     * Metodo get para obtener (leer) el atributo.
     * @return 
     */
    public File getTempFile() {
        return tempFile;
    }
    
    /**
     * Metodo set para asignar (almacenar) el atributo. 
     * @param tempFile
     */
    public void setTempFile(File tempFile) {
        this.tempFile = tempFile;
    }
    
    /**
     * Metodo get para obtener (leer) el atributo.
     * @return 
     */
    public String getActRuta() {
        return actRuta;
    }
    
    /**
     * Metodo set para asignar (almacenar) el atributo. 
     * @param actRuta
     */
    public void setActRuta(String actRuta) {
        this.actRuta = actRuta;
    }
    
    /**
     * Metodo get para obtener (leer) el atributo.
     * @return 
     */
    public String getSistema() {
        return sistema;
    }

    /**
     * Metodo set para asignar (almacenar) el atributo.
     * @param sistema 
     */
    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    /**
     * Metodo get para obtener (leer) el atributo.
     * @return 
     */
    public String getArquitectura() {
        return arquitectura;
    }

    /**
     * Metodo set para asignar (almacenar) el atributo.
     * @param arquitectura 
     */
    public void setArquitectura(String arquitectura) {
        this.arquitectura = arquitectura;
    }

    /**
     * Metodo get para obtener (leer) el atributo.
     * @return 
     */
    public String getUsuRuta() {
        return usuRuta;
    }

    /**
     * Metodo set para asignar (almacenar) el atributo.
     * @param usuRuta 
     */
    public void setUsuRuta(String usuRuta) {
        this.usuRuta = usuRuta;
    }

    /**
     * Metodo get para obtener (leer) el atributo.
     * @return 
     */
    public String getJavaRuta() {
        return javaRuta;
    }

    /**
     * Metodo set para asignar (almacenar) el atributo.
     * @param javaRuta 
     */
    public void setJavaRuta(String javaRuta) {
        this.javaRuta = javaRuta;
    }

    /**
     * Metodo get para obtener (leer) el atributo.
     * @return 
     */
    public String getSepRuta() {
        return sepRuta;
    }

    /**
     * Metodo set para asignar (almacenar) el atributo.
     * @param sepRuta 
     */
    public void setSepRuta(String sepRuta) {
        this.sepRuta = sepRuta;
    }

    /**
     * Metodo get para obtener (leer) el atributo.
     * @return 
     */
    public String getDbRuta() {
        return dbRuta;
    }

    /**
     * Metodo set para asignar (almacenar) el atributo.
     * @param dbRuta 
     */
    public void setDbRuta(String dbRuta) {
        this.dbRuta = dbRuta;
    }
    
    /**
     * Retorna el tipo de Sistema Operativo y la Arquitectura del mismo.
     * @return 
     */
    public String sistemaOperativo() {
        return "Sistema Operativo: \n"+this.sistema+" "+this.arquitectura;
    }
    
    public String javaHome() {
        return "Java Home: \n"+this.javaRuta;
    }
}