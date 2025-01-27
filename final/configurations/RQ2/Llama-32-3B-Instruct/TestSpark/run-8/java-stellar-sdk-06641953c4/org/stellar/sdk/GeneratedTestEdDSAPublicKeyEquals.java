package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestEdDSAPublicKeyEquals {

    @Test
    public void testEdDSAPublicKeyEquals() {
        // Generate EdDSA Public Key
        EdDSAPublicKey eddSAPublicKey1 = new EdDSAPublicKey();
        byte[] publicKey1 = eddSAPublicKey1.generate().getPublic();

        // Generate EdDSA Public Key
        EdDSAPublicKey eddSAPublicKey2 = new EdDSAPublicKey();
        byte[] publicKey2 = eddSAPublicKey2.generate().getPublic();

        // Compare with expected value
        assertTrue(publicKey1.length == publicKey2.length);
    }

}