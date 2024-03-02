package org.apache.camel.learn;

public class Escala {
    public String convertNota(String data){
        try{
            int notaI = Integer.valueOf(data);
            double notaF = notaI * 100 / 20;
            return Double.toString(notaF);
        }catch (NumberFormatException e){
            return "0";
        }
    }
}
