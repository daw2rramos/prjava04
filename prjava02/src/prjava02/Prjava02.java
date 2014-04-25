/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prjava02;

import java.io.IOException;
import java.net.InetAddress;

/**
 *
 * @author alumne
 */
public class Prjava02 {

    public static void main(String[] args) { try {
        InetAddress addr = InetAddress.getLocalHost(); byte[] ipAddr = addr.getAddress();
        String hostname = addr.getHostName(); System.out.println("hostname="+hostname);
        System.out.println("Nom de l'usuari: " + System.getProperty("user.name")); System.out.println("Carpeta Personal: " + System.getProperty("user.home")); System.out.println("Sistema operatiu: " + System.getProperty("os.name")); System.out.println("Versió OS: " + System.getProperty("os.version"));
        }
        catch (IOException e) { e.printStackTrace();}
    }
    
}
