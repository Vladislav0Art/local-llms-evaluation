package org.stellar.sdk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedGetSecretSeedTest {

    @Test
    public void getSecretSeedTest() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new EdDSAPublicKeySpec(new byte[32], KeyPair.ed25519));
        EdDSAPrivateKey privateKey = new EdDSAPrivateKey(new EdDSAPrivateKeySpec(new byte[32], KeyPair.ed25519));
        KeyPair keyPair = new KeyPair(publicKey, privateKey);
        assertEquals("SAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAZ", new String(keyPair.getSecretSeed()));
    }

}