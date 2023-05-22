/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.Remote;
/**
 *
 * @author angel
 */
public interface  MiInterfazRemota extends Remote {
     public void miMetodo1() throws RemoteException;
     public int miMetodo2() throws RemoteException;

     
        
    public static void main(String[] args) {
        try {
            MiInterfazRemota mir = new MiClaseRemota();

            java.rmi.Naming.rebind("//" + 
                    java.net.InetAddress.getLocalHost().getHostAddress() + ":"  
                    + args[0] + "/PruebaRMI", mir);

            } catch (Exception e) {
            }
    }
}
