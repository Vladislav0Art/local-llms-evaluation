package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTestSetCapacidadeKG {

    private String capacidadeKG;
    private String capacidadeM3;

    public String getCapacidadeKG() {
        return capacidadeKG;
    }

    public void setCapacidadeKG(String capacidadeKG) {
        this.capacidadeKG = capacidadeKG;
    }

    public String getCapacidadeM3() {
        return capacidadeM3;
    }

    public void setCapacidadeM3(String capacidadeM3) {
        this.capacidadeM3 = capacidadeM3;
    }
}

public class GeneratedTest {

    private MDFInfoModalRodoviarioVeiculoReboque mdfe;

    @Before
    public void setup() {
        mdfe = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    @Test
    public void testSetCapacidadeKG() {
        mdfe.setCapacidadeKG("10");
        String valor = mdfe.getCapacidadeKG();
        assertEquals("10", valor);
    }

}