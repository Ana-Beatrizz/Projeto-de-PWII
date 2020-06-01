package projetobancocerto;

import javax.swing.JOptionPane;

public class ProjetoBancoCerto {

    public static void main(String[] args) {
        
        Banco dados = new Banco();
        
        dados.setAgencia(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da sua agência: ")));
        dados.setNumConta(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da sua conta: ")));
        dados.setSenha(JOptionPane.showInputDialog(null, "Digite o número da sua senha: "));
        
        dados.logar(dados.getAgencia(), dados.getNumConta(), dados.getSenha());
        
    }
    
}
