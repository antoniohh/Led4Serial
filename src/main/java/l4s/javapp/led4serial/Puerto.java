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
 * Aplicación Led4Serial para el control de un dispositivo Arduino.
 * 
 * @author Antonio Horrillo Horrillo
 */
public class Puerto {
    
    /**
     * Definicion de atributos
     * 
     * public static final int BAUDRATE_110 = 110;
     * public static final int BAUDRATE_300 = 300;
     * public static final int BAUDRATE_600 = 600;
     * public static final int BAUDRATE_1200 = 1200;
     * public static final int BAUDRATE_4800 = 4800;
     * public static final int BAUDRATE_9600 = 9600;
     * public static final int BAUDRATE_14400 = 14400;
     * public static final int BAUDRATE_19200 = 19200;
     * public static final int BAUDRATE_38400 = 38400;
     * public static final int BAUDRATE_57600 = 57600;
     * public static final int BAUDRATE_115200 = 115200;
     * public static final int BAUDRATE_128000 = 128000;
     * public static final int BAUDRATE_256000 = 256000;
     * public static final int DATABITS_5 = 5;
     * public static final int DATABITS_6 = 6;
     * public static final int DATABITS_7 = 7;
     * public static final int DATABITS_8 = 8;
     * public static final int STOPBITS_1 = 1;
     * public static final int STOPBITS_2 = 2;
     * public static final int STOPBITS_1_5 = 3;
     * public static final int PARITY_NONE = 0;
     * public static final int PARITY_ODD = 1;
     * public static final int PARITY_EVEN = 2;
     * public static final int PARITY_MARK = 3;
     * public static final int PARITY_SPACE = 4;
     */    
    private String PortId;
    private int Baudrate;
    private int DataBits;
    private int StopBits;    
    private int Parity; 
    
    /**
     * 
     * @param PortId
     * @param Baudrate
     * @param DataBits
     * @param StopBits
     * @param Parity 
     */
    public Puerto(String PortId, int Baudrate, int DataBits, int StopBits, int Parity) {
        this.PortId = PortId;
        this.Baudrate = Baudrate;
        this.DataBits = DataBits;
        this.StopBits = StopBits;
        this.Parity = Parity;
    }

    /**
     * 
     * @return 
     */
    public String getPortId() {
        return PortId;
    }

    /**
     * 
     * @param PortId 
     */
    public void setPortId(String PortId) {
        this.PortId = PortId;
    }

    /**
     * 
     * @return 
     */
    public int getBaudrate() {
        return Baudrate;
    }

    /**
     * 
     * @param Baudrate 
     */
    public void setBaudrate(int Baudrate) {
        this.Baudrate = Baudrate;
    }

    /**
     * 
     * @return 
     */
    public int getDataBits() {
        return DataBits;
    }

    /**
     * 
     * @param DataBits 
     */
    public void setDataBits(int DataBits) {
        this.DataBits = DataBits;
    }

    /**
     * 
     * @return 
     */
    public int getStopBits() {
        return StopBits;
    }

    /**
     * 
     * @param StopBits 
     */
    public void setStopBits(int StopBits) {
        this.StopBits = StopBits;
    }

    /**
     * 
     * @return 
     */
    public int getParity() {
        return Parity;
    }

    /**
     * 
     * @param Parity 
     */
    public void setParity(int Parity) {
        this.Parity = Parity;
    }    
}
