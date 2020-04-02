
package Servidor;

import Cliente.InterfaceOperacoes;
import java.rmi.*;
import java.rmi.server.*;


public class Calculadora extends UnicastRemoteObject implements InterfaceOperacoes{
    public Calculadora()throws RemoteException{
        System.out.println("Servidor Instanciado....");
    }

    @Override
    public double somar(double a, double b) throws RemoteException {
          return a+b;
    }

    @Override
    public double subtrair(double a, double b) throws RemoteException {
           return a-b;
    }

    @Override
    public double multiplicar(double a, double b) throws RemoteException {
           return a*b;
    }

    @Override
    public double dividir(double a, double b) throws RemoteException {
           return a/b;
    }
 
}
