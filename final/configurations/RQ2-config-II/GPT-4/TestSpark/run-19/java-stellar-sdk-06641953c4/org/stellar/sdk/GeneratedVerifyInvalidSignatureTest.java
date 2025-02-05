package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.KeyPairGenerator;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedVerifyInvalidSignatureTest {

    @Test
    public void verifyInvalidSignatureTest() throws Exception {
        KeyPair keyPair = KeyPair.random();
        String data = "Test data to sign";
        byte[] signature = new byte[]{0, 1, 2, 3, 4, 5}; // Invalid signature
        assertFalse(keyPair.verify(data.getBytes(), signature));
    }

}