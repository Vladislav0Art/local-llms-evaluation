package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.stellar.sdk.KeyPair;

public class GeneratedVerify {

    @Test
    public void verify() {
        byte[] data = "test_data".getBytes();
        byte[] signature = new byte[64];
        KeyPair keyPair = KeyPair.fromSecretSeed(new char[]{'0'});
        assertTrue(keyPair.verify(data, signature));
        assertFalse(keyPair.verify(data, Arrays.copyOf(signature, 63)));
    }

}