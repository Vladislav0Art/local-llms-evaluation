package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedFromPublicKeyTest {

    @Test
    public void fromPublicKeyTest() {
        byte[] publicKey = "1234567890".getBytes();
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotNull(keyPair);
    }

}