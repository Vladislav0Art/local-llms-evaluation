package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;

public class GeneratedTest {

    public int codigoInterno(int n) {
        return n;
    }

    public String placa(String numero) {
        return numero;
    }

    public String renavam(String nome) {
        return nome + " Renavam";
    }

    public String tara(String marca) {
        return marca + " Tara";
    }

    public double capacidadeKG(int peso) {
        if (peso < 50) {
            return 100;
        } else if (peso >= 50 && peso <= 150) {
            return 200.0;
        } else if (peso > 150) {
            return 300.0;
        }
    }

    public double capacidadeM3(int volume) {
        if (volume < 100) {
            return 1.0;
        } else if (volume >= 100 && volume <= 500) {
            return 2.5;
        } else if (volume > 500) {
            return 4.0;
        }
    }
}

}