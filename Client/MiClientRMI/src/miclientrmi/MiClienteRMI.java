/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miclientrmi;


import miinterfazremota.MiInterfazRemota;
/**
 *
 * @author angel
 */
class MiClienteRMI {
    public static void main(String[] args) {
        try {

                MiInterfazRemota mir = (MiInterfazRemota)java.rmi.Naming.lookup("//" + "192.168.100.156" + ":" +"1234" +"/PruebaRMI");
                        

            // Imprimimos miMetodo1() tantas veces
            // como devuelva miMetodo2()
            for (int i = 1; i <= mir.miMetodo2(); i++)
            mir.miMetodo1();
            
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
