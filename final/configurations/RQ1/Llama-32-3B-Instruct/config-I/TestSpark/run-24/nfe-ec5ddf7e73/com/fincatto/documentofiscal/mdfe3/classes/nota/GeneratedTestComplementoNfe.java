package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTestComplementoNfe {

    @Test
    public void testComplementoNfe() {
        // Test Complemento NFe logic here
    }
}

public class Nfe {

    private String numero;

    public Nfe(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public ComplementoNFe getComplemento() {
        // Return complemento NFe logic here
    }
}

public class ComplementoNfe {

    private String cnpj;

    public ComplementoNfe(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}

}