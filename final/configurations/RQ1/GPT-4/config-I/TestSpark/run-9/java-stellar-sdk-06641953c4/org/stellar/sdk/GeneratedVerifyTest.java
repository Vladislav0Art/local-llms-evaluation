package org.stellar.sdk;

import org.junit.Test;

import java.security.GeneralSecurityException;

import static org.junit.Assert.*;

public class GeneratedVerifyTest {

    @Test
    public void verifyTest() throws GeneralSecurityException {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        EdDSAPrivateKey privateKey = Mockito.mock(EdDSAPrivateKey.class);

        KeyPair keyPair = new KeyPair(publicKey, privateKey);

        byte[] data = new byte[]{1, 2, 3};
        byte[] signature = new byte[]{4, 5, 6};

        assertFalse(keyPair.verify(data, signature));
    }

}