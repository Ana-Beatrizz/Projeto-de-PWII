package projetoestacionamento2;

import javax.swing.JOptionPane;

public class Estacionamento {
    
    public String placa;
    public String modelo;
    public double hora_entrada;
    public double min_entrada;
    public double hora_saida;
    public double min_saida;
    protected double preco;
    
  
    public String getPlaca(){
        return placa;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public double getHora_entrada(){
        return hora_entrada;
    }
    
    public void setHora_entrada(double hora_entrada){
        this.hora_entrada = hora_entrada;
    }
    
    public double getMin_entrada(){
        return min_entrada;
    }
    
    public void setMin_entrada(double min_entrada){
        this.min_entrada = min_entrada;
    }
    
    public double getHora_saida(){
        return hora_saida;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void setHora_saida(double hora_saida){
        this.hora_saida = hora_saida;
    }
    
    public double getMin_saida(){
        return min_saida;
    }

    
    public void setMin_saida(double min_saida){
        this.min_saida = min_saida;
    }
    
    public double calcula_tempo (double hora_entrada, double min_entrada, double hora_saida, double min_saida){
        
        double conv_ent = hora_entrada + min_entrada/60;
        double conv_saida = hora_saida + min_saida/60;
        
        double tempo = Math.ceil(conv_saida - conv_ent);      
        return tempo;

    }
    
    public void Gera_nota (double tempo_total, double preco){
        
        double valor_total = tempo_total * preco;
        JOptionPane.showMessageDialog(null,"Estacionamento \n"
                + "Dados do veículo: \n"
                + "Placa: "+ getPlaca()+"\n"
                + "Modelo: "+getModelo()+"\n"
                + "Hora de entrada: "+ getHora_entrada()+"h e "+ getMin_entrada()+"min \n"
                + "Hora de saída: "+ getHora_saida()+"h e "+ getMin_saida()+"min \n"
                + "Preço por hora: " + getPreco() + " reais \n"
                + "Total de horas: " + tempo_total + "horas \n"
                + "Valor total: " + valor_total + " reais");

    }
    
}
