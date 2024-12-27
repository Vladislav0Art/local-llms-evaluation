package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedTest {

    @Test
    public void createKeyPairFromPublic() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey();
        KeyPair keyPair = new KeyPair(publicKey);
        assertNotNull(keyPair);
    }

    @Test
    public void canSignEmptySeedShouldReturnFalse() {
        KeyPair keyPair = KeyPair.fromSecretSeed(new char[0]);
        assertFalse(keyPair.canSign());
    }

    @Test
    public void createKeyPairFromBip39SeedAndAccountNumberShouldNotThrowAnyException() {
        byte[] bip39Seed = new byte[32];
        int accountNumber = 1;
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, accountNumber);
        assertNotNull(keyPair);
    }

    @Test
    public void createKeyPairFromXdrPublicKeyShouldNotThrowAnyException() {
        PublicKey xdrPublicKey = new PublicKey();
        KeyPair keyPair = KeyPair.fromXdrPublicKey(xdrPublicKey);
        assertNotNull(keyPair);
    }

    @Test
    public void createKeyPairFromAccountIdAndSeedShouldReturnTrue() {
        String accountId = "test_account";
        byte[] seed = new byte[32];
        assertTrue(KeyPair.fromSecretSeed(seed).equals(KeyPair.fromAccountId(accountId)));
    }

    @Test
    public void getAccountIdEmptySeedReturnsNull() {
        KeyPair keyPair = KeyPair.fromSecretSeed(new char[0]);
        assertNull(keyPair.getAccountId());
    }

    @Test
    public void getPublicKeyEmptySeedReturnsNull() {
        KeyPair keyPair = KeyPair.fromSecretSeed(new char[0]);
        assertNull(keyPair.getPublicKey());
    }

    @Test
    public void verifySignatureWithInvalidSeedAndDataShouldReturnFalse() {
        byte[] seed = new byte[32];
        byte[] data = new byte[32];
        assertFalse(KeyPair.fromSecretSeed(seed).verify(data, new byte[0]));
    }

    @Test
    public void signEmptySeedAndDataThrowsException() {
        KeyPair keyPair = KeyPair.fromSecretSeed(new char[0]);
        try {
            keyPair.sign(new byte[0]);
            fail("Expected exception");
        } catch (Exception e) {
            // Expected
        }
    }

    @Test
    public void getHashCodeEmptySeedReturnsZero() {
        KeyPair keyPair = KeyPair.fromSecretSeed(new char[0]);
        assertEquals(0, keyPair.hashCode());
    }

    @Test
    public void createKeyPairFromXdrSignerKeyDoesNotThrowException() {
        SignerKey xdrSignerKey = new SignerKey();
        KeyPair keyPair = KeyPair.fromXdrSignerKey(xdrSignerKey);
        assertNotNull(keyPair);
    }

    @Test
    public void equalsNullObjectReturnsFalse() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        assertFalse(keyPair.equals(null));
    }

}