package com.iftm.pooatv03;

public class DataTeste {
    public static void main(String[] args) {
        Data data = new Data(0,0,0);

        data.setDia(20);
        data.setMes(03);
        data.setAno(2024);
        
        System.out.println("Dia: " + data.getDia());
        System.out.println("Mes: " + data.getMes());
        System.out.println("Ano: " + data.getAno());
        
        System.out.println("Data: " + data.displayData());
    }
}
