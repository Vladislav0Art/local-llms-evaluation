package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCanSignWhenPublicKeyIsNotNull {

    @Test
    public void canSignWhenPublicKeyIsNotNull() {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        when(publicKey.getEdDsa()).thenReturn(Mockito.anyObject());
        assertTrue(new KeyPair(publicKey).canSign());
    }

}