package org.stellar.sdk;

import org.junit.Test;

import java.security.GeneralSecurityException;

import static org.junit.Assert.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        EdDSAPrivateKey privateKey = Mockito.mock(EdDSAPrivateKey.class);
        KeyPair keyPair1 = new KeyPair(publicKey, privateKey);
        KeyPair keyPair2 = new KeyPair(publicKey, privateKey);
        assertTrue(keyPair1.equals(keyPair2));
    }

}