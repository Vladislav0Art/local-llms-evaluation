package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedGetSecretSeedshouldReturnCorrectArray {

    @Mock
    private EdDSAPublicKey publicKeyMock;

    @Mock
    private EdDSAEngine eddsaEngineMock;

    public KeyPair keyPair = new KeyPair(publicKeyMock);

    public void setUp() {
        Mockito.when(publicKeyMock.getEncoded()).thenReturn("public_key_bytes".getBytes());
        Mockito.when(eddsaEngineMock.generateKeyPair()).thenReturn(keyPair);
    }

    @Test
    public void getSecretSeedshouldReturnCorrectArray() {
        char[] seed = "secret_seed".toCharArray();
        assertArrayEquals(seed, keyPair.getSecretSeed());
    }

}