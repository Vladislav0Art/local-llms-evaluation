package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.stellar.sdk.KeyPair;

public class GeneratedSign {

    @Test
    public void sign() {
        byte[] data = "test_data".getBytes();
        byte[] signature = new byte[64];
        KeyPair keyPair = KeyPair.fromSecretSeed(new char[]{'0'});
        assertTrue(keyPair.sign(data).length == 64);
        for (int i = 0; i < 64; i++) {
            assertEquals(signature[i], keyPair.sign(data)[i]);
        }
    }

}