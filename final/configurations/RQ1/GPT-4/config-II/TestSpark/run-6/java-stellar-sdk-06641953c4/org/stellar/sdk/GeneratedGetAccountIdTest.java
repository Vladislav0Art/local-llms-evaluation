package org.stellar.sdk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedGetAccountIdTest {

    @Test
    public void getAccountIdTest() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new EdDSAPublicKeySpec(new byte[32], KeyPair.ed25519));
        KeyPair keyPair = new KeyPair(publicKey);
        assertEquals("GAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAWHF", keyPair.getAccountId());
    }

}