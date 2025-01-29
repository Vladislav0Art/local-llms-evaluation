package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTest {

    public void setCodigoInterno(String codigo) {
        // implement method to set CodigoInterno
    }

    public void setPlaca(String placa) {
        // implement method to set Placa
    }

    public void setRenavam(double renavam) {
        // implement method to set Renavam
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
}

public class TestCarro {
    private Carro carro;

    public TestCarro(Carro carro) {
        this.carro = carro;
    }

    public void teste1() {
        // implement test 1
    }

    public void teste2() {
        // implement test 2
    }

    @Test
    public void teste3() {
        Carro carros = new Carro();
        carros.setCodigoInterno("123");
        carros.setPlaca("ABC123");
        carros.setRenavam(1.5);
        carros.setTara(1000.0);
        carros.setCapacidadeKG(50.0);
        carros.setCapacidadeM3(10.0);

        // Implement test 4
    }

    public static void main(String[] args) {
        TestCarro test = new TestCarro(new Carro());
        test.teste1();
        test.teste2();

        System.out.println(carro.getCodigoInterno());
        System.out.println(carro.getPlaca());
        System.out.println(carro.getRenavam());
        System.out.println(carro.getTara());
        System.out.println(carro.getCapacidadeKG());
        System.out.println(carro.getCapacidadeM3());
    }

}