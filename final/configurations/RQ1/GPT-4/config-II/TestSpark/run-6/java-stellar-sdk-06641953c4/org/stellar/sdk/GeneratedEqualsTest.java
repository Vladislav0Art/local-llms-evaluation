package org.stellar.sdk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new EdDSAPublicKeySpec(new byte[32], KeyPair.ed25519));
        KeyPair keyPair1 = new KeyPair(publicKey);
        KeyPair keyPair2 = new KeyPair(publicKey);
        assertEquals(keyPair1, keyPair2);
    }

}