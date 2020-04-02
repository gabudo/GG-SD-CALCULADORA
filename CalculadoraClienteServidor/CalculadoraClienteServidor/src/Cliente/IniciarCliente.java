package Cliente;

import java.rmi.Naming;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;



public class IniciarCliente {
        public static void main(String[] args) {
            try{
                InterfaceOperacoes c = (InterfaceOperacoes) Naming.lookup( "rmi://127.0.0.1:1099/CalculadoraRMI");
                
                String numero1 = JOptionPane.showInputDialog(null, "Entre com o Primeiro Numero","Entrada de Dados", JOptionPane.QUESTION_MESSAGE);
                String numero2 = JOptionPane.showInputDialog(null, "Entre com o Segundo Numero","Entrada de Dados", JOptionPane.QUESTION_MESSAGE);
                
                double n1 = Double.parseDouble(numero1);
                double n2 = Double.parseDouble(numero2);
                
                Object[] operacoes = { "somar","subtrair","multiplicar","dividir"};
                Object selecionado = JOptionPane.showInputDialog(null,"Escolha a Operação","Operação",JOptionPane.INFORMATION_MESSAGE,null,operacoes,operacoes[0]);
                
                if(selecionado == "somar"){
                    JOptionPane.showMessageDialog(null,"O resultado é "+c.somar(n1,n2),"Resultado",JOptionPane.INFORMATION_MESSAGE);
                }
                if (selecionado == "subtrair"){
                    JOptionPane.showMessageDialog(null,"O resultado é "+c.subtrair(n1,n2),"Resultado",JOptionPane.INFORMATION_MESSAGE);
                    }
                if (selecionado == "multiplicar"){
                    JOptionPane.showMessageDialog(null,"O resultado é "+c.multiplicar(n1,n2),"Resultado",JOptionPane.INFORMATION_MESSAGE);
                }
                if (selecionado == "dividir"){
                    JOptionPane.showMessageDialog(null,"O resultado é "+c.dividir(n1,n2),"Resultado",JOptionPane.INFORMATION_MESSAGE);
                }  
            }
        
        catch(RemoteException re){ JOptionPane.showMessageDialog(null,"Erro Remoto: "+re.toString(),"Erro Remoto",JOptionPane.WARNING_MESSAGE);}
        catch(Exception e){ JOptionPane.showMessageDialog(null,"Erro Local: "+e.toString(),"Erro Local",JOptionPane.WARNING_MESSAGE);}
        }
                               
        }