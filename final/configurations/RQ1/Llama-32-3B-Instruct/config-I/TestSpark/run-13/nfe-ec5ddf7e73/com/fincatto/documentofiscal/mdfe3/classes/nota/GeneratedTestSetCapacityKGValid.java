package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTestSetCapacityKGValid {

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
    public void testSetCapacityKGValid() {
        CapacidadeKG capacidade = new CapacidadeKG();
        capacidade.setCapacidade(100);
        capacidade.setUnidade("kg");
        capacidade.setValorUnitario(10.0);

        setCapacidadeKG(capacidade, true);
    }

}