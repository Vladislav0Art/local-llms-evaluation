package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGeneratePublicKey {

    @Test
    public void generatePublicKey() {
        String publicKey = PrivateKeyGenerator.generatePublicKey();
        assertEquals("public key", publicKey);
    }

}