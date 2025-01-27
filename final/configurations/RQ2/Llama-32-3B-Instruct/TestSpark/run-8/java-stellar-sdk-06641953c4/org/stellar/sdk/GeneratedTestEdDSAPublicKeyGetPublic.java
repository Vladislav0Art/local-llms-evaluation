package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestEdDSAPublicKeyGetPublic {

    @Test
    public void testEdDSAPublicKeyGetPublic() {
        // Generate EdDSA Public Key
        EdDSAPublicKey eddSAPublicKey = new EdDSAPublicKey();
        byte[] publicKey = eddSAPublicKey.generate().getPublic();

        // Compare with expected value
        byte[] expectedPublicKey = {1, 2, 3};
        assertEquals(expectedPublicKey.length, publicKey.length);
        for (int i = 0; i < publicKey.length; i++) {
            assertTrue(publicKey[i] == expectedPublicKey[i]);
        }
    }

}