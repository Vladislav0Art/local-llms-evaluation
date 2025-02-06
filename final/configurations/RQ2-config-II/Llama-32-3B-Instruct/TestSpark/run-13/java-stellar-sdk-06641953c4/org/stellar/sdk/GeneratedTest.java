package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void newKeyPairCreationSuccess() {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        when(publicKey.toString()).thenReturn("testPublicKey");
        KeyPair keyPair = new KeyPair(publicKey);
        assertNotNull(keyPair);
        assertEquals(publicKey, keyPair.getPublicKey());
    }

    @Test
    public void canSignMethodSuccess() {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        when(publicKey.toString()).thenReturn("testPublicKey");
        KeyPair keyPair = new KeyPair(publicKey);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedCharArraySuccess() {
        char[] seed = {'a', 'b', 'c'};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
        assertNotEquals(0, keyPair.getSecretSeed().length);
    }

    @Test
    public void fromAccountIDMethodSuccess() {
        String accountId = "testAccountId";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
        assertEquals(accountId, keyPair.getAccountId());
    }

    @Test
    public void fromPublicKeyByteArrSuccess() {
        byte[] publicKey = {1, 2, 3};
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotNull(keyPair);
        assertNotEquals(0, keyPair.getPublicKey().length);
    }

    @Test
    public void signMethodSuccess() {
        KeyPair keyPair = new KeyPair(Mockito.mock(EdDSAPublicKey.class));
        byte[] data = {1, 2, 3};
        byte[] signature = {4, 5, 6};
        when(keyPair.getPublicKey().toString()).thenReturn("testPublicKey");
        when(keyPair.sign(data)).thenReturn(signature);
        assertTrue(new DecoratedSignature(signature).getSignature().equals(signature));
    }

    @Test
    public void verifyMethodSuccess() {
        KeyPair keyPair = new KeyPair(Mockito.mock(EdDSAPublicKey.class));
        byte[] data = {1, 2, 3};
        byte[] signature = {4, 5, 6};
        when(keyPair.getPublicKey().toString()).thenReturn("testPublicKey");
        when(keyPair.sign(data)).thenReturn(signature);
        assertTrue(keyPair.verify(data, signature));
    }

    @Test
    public void hashCodeMethodSuccess() {
        KeyPair keyPair = new KeyPair(Mockito.mock(EdDSAPublicKey.class));
        int expectedHashcode = 1234;
        assertEquals(expectedHashcode, keyPair.hashCode());
    }

}