package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private KeyPair keyPair;

    @Mock
    private MessageDigest messageDigest;

    @Test
    public void testGetAccountId() {
        when(keyPair.getAccountId()).thenReturn("test123");
        assertEquals(keyPair.getAccountId(), "test123");
    }

    @Test
    public void testGetSecretSeed() {
        when(keyPair.getSecretSeed()).thenReturn("test123".toCharArray());
        assertEquals(keyPair.getSecretSeed(), "test123".toCharArray());
    }

    @Test
    public void testGetPublicKey() {
        when(keyPair.getPublicKey()).thenReturn("test123".getBytes());
        assertEquals(keyPair.getPublicKey(), "test123".getBytes());
    }

    @Test
    public void testGetSignatureHint() {
        SignatureHint signatureHint = new SignatureHint();
        when(keyPair.getSignatureHint()).thenReturn(signatureHint);
        assertEquals(keyPair.getSignatureHint(), signatureHint);
    }

    @Test
    public void testGetXdrPublicKey() {
        PublicKey publicKey = new PublicKey();
        when(keyPair.getXdrPublicKey()).thenReturn(publicKey);
        assertEquals(keyPair.getXdrPublicKey(), publicKey);
    }

}