package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGeneratePrivateKey {

    @Test
    public void generatePrivateKey() {
        String privateKey = PrivateKeyGenerator.generatePrivateKey();
        assertEquals("private key", privateKey);
    }

}