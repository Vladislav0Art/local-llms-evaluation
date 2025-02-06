package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void constructorWithPublicKeyShouldNotThrowException() {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        new KeyPair(publicKey);
    }

    @Test
    public void canSignWhenPublicKeyIsNotNull() {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        when(publicKey.getEdDsa()).thenReturn(Mockito.anyObject());
        assertTrue(new KeyPair(publicKey).canSign());
    }

    @Test
    public void cannotSignWhenPublicKeyIsNull() {
        assertNull(new KeyPair(null).canSign());
    }

    @Test
    public void fromSecretSeedByteShouldReturnKeyPair() {
        char[] seed = Mockito.mock(char[].class);
        byte[] expectedSeed = new byte[]{1, 2, 3};
        when(seed).length().thenReturn(expectedSeed.length);
        assertEquals(KeyPair.fromSecretSeed(seed), new KeyPair(expectedSeed));
    }

    @Test
    public void fromSecretSeedStringShouldReturnKeyPair() {
        String seed = Mockito.mock(String.class);
        byte[] expectedSeed = "test".getBytes();
        when(seed).getBytes().thenReturn(expectedSeed);
        assertEquals(KeyPair.fromSecretSeed(seed), new KeyPair(expectedSeed));
    }

    @Test
    public void fromAccountIdShouldReturnKeyPair() {
        String accountId = Mockito.mock(String.class);
        byte[] expectedPublicKey = new byte[]{1, 2, 3};
        when(accountId).equals("account123").thenReturn(true);
        assertEquals(KeyPair.fromAccountId(accountId), new KeyPair(expectedPublicKey));
    }

    @Test
    public void fromBip39SeedShouldReturnKeyPair() {
        byte[] bip39Seed = Mockito.mock(byte[].class);
        int accountNumber = 2;
        byte[] expectedPublicKey = new byte[]{1, 2, 3};
        when(bip39Seed).length().thenReturn(expectedPublicKey.length);
        assertEquals(KeyPair.fromBip39Seed(bip39Seed, accountNumber), new KeyPair(expectedPublicKey));
    }

    @Test
    public void randomShouldReturnKeyPair() {
        assertNotEquals(0, new KeyPair(random()).hashCode());
    }

    @Test
    public void getAccountIdShouldReturnString() {
        byte[] expectedAccount = "account123".getBytes();
        when(new KeyPair(expectedAccount)).getAccountId().thenReturn("account123");
        assertEquals("account123", new KeyPair(expectedAccount).getAccountId());
    }

    @Test
    public void getSecretSeedShouldReturnCharArray() {
        byte[] expectedSeed = new byte[]{1, 2, 3};
        when(new KeyPair(expectedSeed)).getSecretSeed().thenReturn(expectedSeed);
        assertEquals(expectedSeed, new KeyPair(expectedSeed).getSecretSeed());
    }

    @Test
    public void getPublicKeyShouldReturnByteArray() {
        byte[] expectedKey = new byte[]{1, 2, 3};
        when(new KeyPair(expectedKey)).getPublicKey().thenReturn(expectedKey);
        assertEquals(expectedKey, new KeyPair(expectedKey).getPublicKey());
    }

    @Test
    public void signShouldThrowGeneralSecurityExceptionWhenSignatureIsNull() {
        assertThrows(GeneralSecurityException.class, () -> new KeyPair(null).sign(new byte[]{1}));
    }

}