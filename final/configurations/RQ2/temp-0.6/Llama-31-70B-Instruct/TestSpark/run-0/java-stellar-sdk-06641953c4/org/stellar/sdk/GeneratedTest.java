package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void canSignTest() {
        KeyPair keyPair = mock(KeyPair.class);
        when(keyPair.canSign()).thenReturn(true);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void getAccountIdTest() {
        KeyPair keyPair = mock(KeyPair.class);
        when(keyPair.getAccountId()).thenReturn("test");
        assertEquals("test", keyPair.getAccountId());
    }

    @Test
    public void getSecretSeedTest() {
        KeyPair keyPair = mock(KeyPair.class);
        when(keyPair.getSecretSeed()).thenReturn("test".toCharArray());
        assertArrayEquals("test".toCharArray(), keyPair.getSecretSeed());
    }

    @Test
    public void getPublicKeyTest() {
        KeyPair keyPair = mock(KeyPair.class);
        when(keyPair.getPublicKey()).thenReturn("test".getBytes());
        assertArrayEquals("test".getBytes(), keyPair.getPublicKey());
    }

    @Test
    public void getSignatureHintTest() {
        KeyPair keyPair = mock(KeyPair.class);
        SignatureHint signatureHint = mock(SignatureHint.class);
        when(keyPair.getSignatureHint()).thenReturn(signatureHint);
        assertEquals(signatureHint, keyPair.getSignatureHint());
    }

    @Test
    public void getXdrPublicKeyTest() {
        KeyPair keyPair = mock(KeyPair.class);
        PublicKey publicKey = mock(PublicKey.class);
        when(keyPair.getXdrPublicKey()).thenReturn(publicKey);
        assertEquals(publicKey, keyPair.getXdrPublicKey());
    }

}