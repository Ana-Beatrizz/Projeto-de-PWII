package projetocontadeluz;

import javax.swing.JOptionPane;

public class ProjetoContadeLuz {

    public static void main(String[] args) {
        
        Conta dados = new Conta();
        
        dados.setLeituraAnterior(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da leitura anterior:")));
        dados.setLeituraAtual(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da leitura atual:")));
        
    int quantidade = dados.leitura(dados.getLeituraAnterior(), dados.getLeituraAtual());
    
    double Parcial = dados.cobranca(quantidade, dados.getTusd(), dados.getTe());
    
    dados.setTotal(dados.verificaBandeira(quantidade, Parcial));

    dados.imprimeConta(dados.getTotal());
    
    }
   
}
