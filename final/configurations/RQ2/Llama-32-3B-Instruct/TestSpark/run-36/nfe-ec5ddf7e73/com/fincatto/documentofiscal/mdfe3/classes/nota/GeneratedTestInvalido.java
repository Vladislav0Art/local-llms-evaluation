package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTestInvalido {

    private String valorFiscal;
    private String[] valoresPossibles;

    public DFStringValidador(String valorFiscal, String[] valoresPossibles) {
        this.valorFiscal = valorFiscal;
        this.valoresPossibles = valoresPossibles;
    }

    public boolean isValid() {
        return true; // por ejemplo
    }
}

public class GeneratedTest {

    @Test
    public void testInvalido() {
        DFStringValidador validador = new DFStringValidador("123456", new String[]{"789012"});
        validador.isValid(); // lanzará una excepción
    }

}