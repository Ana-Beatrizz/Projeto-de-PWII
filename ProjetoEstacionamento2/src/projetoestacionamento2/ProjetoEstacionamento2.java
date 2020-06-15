package projetoestacionamento2;

import javax.swing.JOptionPane;

public class ProjetoEstacionamento2 {

    public static void main(String[] args) {
        
        Estacionamento dados = new Estacionamento();
        
        dados.setPlaca(JOptionPane.showInputDialog("Digite a placa do veículo:"));
        dados.setModelo(JOptionPane.showInputDialog("Digite o modelo do veículo:"));
        
        dados.setHora_entrada(Double.parseDouble(JOptionPane.showInputDialog("Digite a hora de entrada:")));
        dados.setMin_entrada(Double.parseDouble(JOptionPane.showInputDialog("Digite o minuto de entrada:")));
        
        dados.setHora_saida(Double.parseDouble(JOptionPane.showInputDialog("Digite a hora de saída:")));
        dados.setMin_saida(Double.parseDouble(JOptionPane.showInputDialog("Digite o minuto de saída:")));
        
        dados.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço por hora:")));
        
        double tempo_total = dados.calcula_tempo(dados.getHora_entrada(),dados.getMin_entrada(), dados.getHora_saida(),dados.getMin_saida());
        dados.Gera_nota(tempo_total, dados.getPreco());
        
    }
    
}
