package org.stellar.sdk;

import org.junit.Test;

import java.security.GeneralSecurityException;

import static org.junit.Assert.*;

public class GeneratedSignPayloadDecoratedTest {

    @Test
    public void signPayloadDecoratedTest() {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        byte[] publicKeyByte = new byte[]{1, 2, 3};
        Mockito.when(publicKey.getAbyte()).thenReturn(publicKeyByte);

        KeyPair keyPair = new KeyPair(publicKey);

        byte[] signerPayload = new byte[]{4, 5, 6};
        DecoratedSignature decoratedSignature = keyPair.signPayloadDecorated(signerPayload);

        assertNotNull(decoratedSignature);
    }

}