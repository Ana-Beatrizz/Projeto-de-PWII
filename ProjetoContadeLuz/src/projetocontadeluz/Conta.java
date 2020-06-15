package projetocontadeluz;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Conta {
    
    public int leituraAnterior;
    public int leituraAtual;
    public double tusd= 0.3;
    public double te= 0.29;
    public double total;
    public double ValorParcial;
    public String corBandeira;
    public int difLeitura;
     
    public int getLeituraAnterior(){
        return leituraAnterior;
    }
    
    public void setLeituraAnterior(int leituraAnterior){
        this.leituraAnterior = leituraAnterior;
    }
    
    public int getLeituraAtual(){
        return leituraAtual;
    }
    
    public void setLeituraAtual(int leituraAtual){
        this.leituraAtual = leituraAtual;
    }
    
    public double getTusd(){
        return tusd;
    }
    
    public void setTusd(double tusd){
        this.tusd = tusd;
    }
    
    public double getTe(){
        return te;
    }
    
    public void setTe(double te){
        this.te = tusd;
    }
    
    public double getTotal(){
        return total;
    }
    
    public void setTotal(double total){
        this.total = total;
    }
    
    public double getValorParcial(){
        return ValorParcial;
    }
    
    public void setValorParcial(double ValorParcial){
        this.ValorParcial = ValorParcial;
    }
    
    public String getcorBandeira(){
        return corBandeira;
    }
    
    public void setcorBandeira(String corBandeira){
        this.corBandeira = corBandeira;
    }
    
    public int getDifLeitura(){
        return difLeitura;
    }
    
    public void setDifLeitura(int difLeitura){
        this.difLeitura = difLeitura;
    }
    
       public int leitura (int leituraAnterior, int leituraAtual){
           
           int diferenca = leituraAtual - leituraAnterior;
           this.setDifLeitura(diferenca);
           return diferenca;
    }
    
    public double cobranca (int quantidade, double tusd, double te){
        
        double CalTe = quantidade * te;
        double CalTusd = quantidade * tusd;
        
        double Parcial = CalTe + CalTusd;
        
        return Parcial;
        
    }
    
    public double verificaBandeira (int quantidade, double Parcial){
        
        double Total;
        
        if (quantidade < 100){
            Total = Parcial; 
            corBandeira = "Verde";
                 
        }
        else if (quantidade >= 100 && quantidade < 150){
            Total = (quantidade * 0.013)+ Parcial;
            corBandeira = "Amarela";
            
        }
        else if (quantidade >= 150 && quantidade < 200){
            Total = (quantidade * 0.042)+ Parcial;
            corBandeira = "Vermelha 1";
           
        }
        else {
            Total = (quantidade * 0.062)+ Parcial;
            corBandeira = "Vermelha 2";
            
        } 
        return Total;
        
    }
    
    public void imprimeConta(double precoTotal){
        
        DecimalFormat df = new DecimalFormat("#.00");
        
        JOptionPane.showMessageDialog(null,"Companhia Bancária \n"
                + "----------------------------------------- \n"
                + "Consumo Anterior: " + this.getLeituraAnterior()+ " Kw \n"
                + "Consumo Atual: " + this.getLeituraAtual()+ " Kw \n"
                + "Quantidade Consumida: " + this.getDifLeitura()+ " Kw \n"
                + "Bandeira: " + this.getcorBandeira()+ "\n"
                + "Valor Total: " + df.format(this.getTotal()) + " reais");
        
    }
        
}
