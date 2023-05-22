/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_rmi;

import java.rmi.RemoteException;
import java.rmi.Remote;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author angel
 */
public class MiClaseRemota  extends UnicastRemoteObject  implements MiInterfazRemota{
            public MiClaseRemota() throws java.rmi.RemoteException {
            // Código del constructor
            }

            public void miMetodo1() throws java.rmi.RemoteException {
            // Aquí ponemos el código que queramos
            System.out.println("Estoy en miMetodo1()");
}    

    @Override
    public int miMetodo2() throws RemoteException {
        System.out.println("¡Hello World!");
        
        return 5;
    }
    
    public void otroMetodo() {
//
//
    }
 
    
}

