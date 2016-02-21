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
package led4serial;

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
    private String dllRuta;
    private String soRuta;
    private String jarRuta;

    // Constructor que inicializa los atributos a cero.
    
    /**
     * Constructor de clase que inicializa los atributos a null.
     */
    public Sistema() {        
        this.sistema = System.getProperty("os.name" );
        this.arquitectura = System.getProperty("os.arch");
        this.usuRuta = System.getProperty("user.dir");
        this.javaRuta = System.getProperty("java.home");
        this.sepRuta = System.getProperty("file.separator");
        this.dllRuta = this.javaRuta+this.sepRuta+"bin"+this.sepRuta+
                "rxtxSerial.dll";
        this.soRuta = this.javaRuta+this.sepRuta+"lib"+this.sepRuta+"amd64"+
                this.sepRuta+"librxtxSerial.so";
        this.jarRuta = this.javaRuta+this.sepRuta+"lib"+this.sepRuta+"ext"+
                this.sepRuta+"RXTXcomm.jar";   
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
     * @param dllRuta
     * @param soRuta
     * @param jarRuta 
     */
    public Sistema(String sistema, String arquitectura, String usuRuta, 
            String javaRuta, String sepRuta, String dllRuta, String soRuta, 
            String jarRuta) {
        this.sistema = sistema;
        this.arquitectura = arquitectura;
        this.usuRuta = usuRuta;
        this.javaRuta = javaRuta;
        this.sepRuta = sepRuta;
        this.dllRuta = dllRuta;
        this.soRuta = soRuta;
        this.jarRuta = jarRuta;
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
    public String getDllRuta() {
        return dllRuta;
    }

    /**
     * Metodo set para asignar (almacenar) el atributo.
     * @param dllRuta 
     */
    public void setDllRuta(String dllRuta) {
        this.dllRuta = dllRuta;
    }

    /**
     * Metodo get para obtener (leer) el atributo.
     * @return 
     */
    public String getSoRuta() {
        return soRuta;
    }

    /**
     * Metodo set para asignar (almacenar) el atributo.
     * @param soRuta 
     */
    public void setSoRuta(String soRuta) {
        this.soRuta = soRuta;
    }

    /**
     * Metodo get para obtener (leer) el atributo.
     * @return 
     */
    public String getJarRuta() {
        return jarRuta;
    }

    /**
     * Metodo set para asignar (almacenar) el atributo.
     * @param jarRuta 
     */
    public void setJarRuta(String jarRuta) {
        this.jarRuta = jarRuta;
    }
    
    /**
     * Retorna el tipo de Sistema Operativo y la Arquitectura del mismo.
     * @return 
     */
    public String sistemaOperativo() {
        return "Sistema Operativo: "+this.sistema+" "+this.arquitectura;
    }
}