package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.KeyPairGenerator;
import org.junit.Test;

import java.security.GeneralSecurityException;

import static org.junit.Assert.*;

public class GeneratedVerifyTest {

    @Test
    public void verifyTest() throws GeneralSecurityException {
        org.stellar.sdk.KeyPair keyPair = org.stellar.sdk.KeyPair.random();

        byte[] data = new byte[0];
        byte[] signature = keyPair.sign(data);

        assertTrue(keyPair.verify(data, signature));
    }

}