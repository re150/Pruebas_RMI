/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_rmi;

import java.rmi.RemoteException;
import java.rmi.Remote;
import miinterfazremota.MiInterfazRemota;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author angel
 */
public class MiClaseRemota  extends UnicastRemoteObject  implements MiInterfazRemota{
     public MiClaseRemota() throws RemoteException {
            // Código del constructor
     }

     public void miMetodo1() throws RemoteException {
      // Aquí ponemos el código que queramos
      System.out.println("Estoy en miMetodo1()");
    }    

    public int miMetodo2() throws RemoteException {
        System.out.println("¡Hello World!");
        return 5;
    }
    
    public void otroMetodo() {
//
//
    }
 
        public static void main(String[] args) {
        try {
           MiInterfazRemota mir = new MiClaseRemota();

            java.rmi.Naming.rebind("//" + "192.168.100.11" + ":" +"1234" +"/PruebaRMI",mir);

            } catch (Exception e) {
            }
    }
    
}

