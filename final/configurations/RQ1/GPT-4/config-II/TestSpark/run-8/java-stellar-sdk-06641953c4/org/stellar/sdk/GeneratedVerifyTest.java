package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.GeneralSecurityException;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedVerifyTest {

    @Test
    public void verifyTest() throws GeneralSecurityException {
        KeyPair keyPair = KeyPair.random();
        byte[] data = new byte[32];
        new java.security.SecureRandom().nextBytes(data);
        byte[] signature = keyPair.sign(data);
        assertTrue(keyPair.verify(data, signature));
    }

}