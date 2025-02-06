package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedNewKeyPairFromPublicKeypairTest {

    @Test
    public void newKeyPairFromPublicKeypairTest() {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(publicKey);
        assertNotNull(keyPair);
    }

}