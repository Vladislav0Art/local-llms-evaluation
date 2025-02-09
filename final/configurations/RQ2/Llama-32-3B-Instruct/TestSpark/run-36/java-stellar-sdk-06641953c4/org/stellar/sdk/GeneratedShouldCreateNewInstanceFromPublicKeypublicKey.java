package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedShouldCreateNewInstanceFromPublicKeypublicKey {

    @Mock
    private EdDSAPublicKey publicKeyMock;

    @Mock
    private EdDSAEngine eddsaEngineMock;

    public KeyPairTest() {
        Mockito.when(publicKeyMock.getEncoded()).thenReturn("public_key_bytes".getBytes());
        Mockito.when(eddsaEngineMock.generateKeyPair()).thenReturn(new KeyPair(publicKeyMock));
    }

    @Test
    public void shouldCreateNewInstanceFromPublicKeypublicKey() {
        assertEquals(1, KeyPair.fromPublicKey(publicKeyMock.getEncoded()).hashCode());
    }

}