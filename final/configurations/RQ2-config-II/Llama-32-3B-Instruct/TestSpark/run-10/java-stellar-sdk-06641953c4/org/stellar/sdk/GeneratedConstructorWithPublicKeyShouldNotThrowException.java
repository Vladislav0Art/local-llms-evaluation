package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedConstructorWithPublicKeyShouldNotThrowException {

    @Test
    public void constructorWithPublicKeyShouldNotThrowException() {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        new KeyPair(publicKey);
    }

}