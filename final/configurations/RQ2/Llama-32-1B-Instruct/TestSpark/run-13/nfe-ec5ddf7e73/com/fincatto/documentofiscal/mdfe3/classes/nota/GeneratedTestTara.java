package com.fincatto.documentofiscal.mdfe3.classes.nota;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestTara {

    private String codigoInterno;
    private String placa;
    private int renavam;
    private double tara;
    private double capacidadeKG;
    private double capacidadeM3;

    public void init() {
        this.codigoInterno = "123";
        this.placa = "ABC123";
        this.renavam = 1.5;
        this.tara = 1000.0;
        this.capacidadeKG = 50.0;
        this.capacidadeM3 = 10.0;
    }

    public String getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoInterno(String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getRenavam() {
        return renavam;
    }

    public void setRenavam(int renavam) {
        this.renavam = renavam;
    }

    public double getTara() {
        return tara;
    }

    public void setTara(double tara) {
        this.tara = tara;
    }

    public double getCapacidadeKG() {
        return capacidadeKG;
    }

    public void setCapacidadeKG(double capacidadeKG) {
        this.capacidadeKG = capacidadeKG;
    }

    public double getCapacidadeM3() {
        return capacidadeM3;
    }

    public void setCapacidadeM3(double capacidadeM3) {
        this.capacidadeM3 = capacidadeM3;
    }

    public Carro init() {
        init();
        return this;
    }

    public static Carro createCarro(String codigoInterno, String placa, int renavam, double tara, double capacidadeKG, double capacidadeM3) {
        return new Carro().init().setCodigoInterno(codigoInterno).setPlaca(placa).setRenavam(renavam).setTara(tara).setCapacidadeKG(capacidadeKG).setCapacidadeM3(capacidadeM3);
    }

    public static Map<String, Object> createCarroMap(String codigoInterno, String placa, int renavam, double tara, double capacidadeKG, double capacidadeM3) {
        return new HashMap<>();
    }
}

public class TestCarro {
    private Carro carro;

    @Test
    public void testTara() {
        carro = CreateCarro.createCarro("123", "ABC123", 1.5, 1000.0, 50.0, 10.0);
        assertEquals(carro.getTara(), 1000.0);
    }

}