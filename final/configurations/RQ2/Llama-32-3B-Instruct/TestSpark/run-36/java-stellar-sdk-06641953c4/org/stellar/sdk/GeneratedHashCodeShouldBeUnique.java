package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedHashCodeShouldBeUnique {

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
    public void hashCodeShouldBeUnique() {
        // Assuming that two KeyPairs with the same bytes are considered equal.
        assertEquals(1, new KeyPair(new EdDSAPrivateKeySpec()).hashCode());
        assertNotEquals(new KeyPair(new EdDSAPrivateKeySpec()), new KeyPair(new EdDSAPrivateKeySpec()));
    }

}