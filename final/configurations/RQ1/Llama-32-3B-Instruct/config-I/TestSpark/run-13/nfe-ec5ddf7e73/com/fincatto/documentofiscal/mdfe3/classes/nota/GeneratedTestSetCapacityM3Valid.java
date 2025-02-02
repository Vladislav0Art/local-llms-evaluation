package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTestSetCapacityM3Valid {

    private double capacidade;
    private String unidade;
    private Double valorUnitario;

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}

public class CapacidadeM3 {
    private double capacidade;
    private String unidade;
    private Double valorUnitario;

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}

public class TestClass1 {

    @Test
    public void testSetCapacityM3Valid() {
        CapacidadeM3 capacidade = new CapacidadeM3();
        capacidade.setCapacidade(100);
        capacitude.setUnidade("m³");
        capacitude.setValorUnitario(10.0);

        setCapacidadeM3(capacidade, true);
    }

    public static void setCapacidadeKG(CapacidadeKG capacidade, boolean valorValido) {
        if (valorValido && capacidade.getCapacidade() != 0
                && capacidade.getUnidade().equals("kg") && capacidade.getValorUnitario() > 0.0) {
            System.out.println("Capacidade KG válida");
        } else {
            System.out.println("Capacidade KG inválida");
        }
    }

    public static void setCapacidadeM3(CapacidadeM3 capacidade, boolean valorValido) {
        if (valorValido && capacidade.getCapacidade() != 0
                && capacidade.getUnidade().equals("m³") && capacidade.getValorUnitario() > 0.0) {
            System.out.println("Capacidade M3 válida");
        } else {
            System.out.println("Capacidade M3 inválida");
        }
    }

}