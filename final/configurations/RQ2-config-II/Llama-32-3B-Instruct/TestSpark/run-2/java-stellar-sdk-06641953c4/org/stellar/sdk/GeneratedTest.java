package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.Signature;
import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void canSign_GivenPublicPrivateKeyTrue_ReturnsTrue() {
        boolean canSign = KeyPair.canSign(true, true);
        assertTrue(canSign);
    }

    @Test
    public void canSign_GivenPublicPrivateKeyFalse_ReturnsFalse() {
        boolean canSign = KeyPair.canSign(false, false);
        assertFalse(canSign);
    }

    @Test
    public void fromSecretSeed_GivenSeedLengthReturnsKeyPair() throws GeneralSecurityException, IOException {
        KeyPair keyPair = KeyPair.fromSecretSeed("seed".getBytes());
        assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeed_GivenSeedIncorrectLengthThrowsGeneralSecurityException() throws GeneralSecurityException, IOException {
        assertThrows(GeneralSecurityException.class, () -> KeyPair.fromSecretSeed("short".getBytes()));
    }

    @Test
    public void getAccountId_GivenKeyPairReturnsAccountNumber() {
        String accountId = "account123";
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(accountId));
        assertEquals(accountId, keyPair.getAccountId());
    }

    @Test
    public void getSecretSeed_GivenKeyPairReturnsSecretSeed() throws IOException, GeneralSecurityException {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey("seed".getBytes()));
        byte[] secretSeed = keyPair.getSecretSeed();
        assertNotNull(secretSeed);
    }

    @Test
    public void getPublicKey_GivenKeyPairReturnsPublicKey() {
        byte[] publicKey = {1, 2, 3};
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(publicKey));
        assertEquals(publicKey, keyPair.getPublicKey());
    }

    @Test
    public void sign_GivenDataSignature

    ReturnsDecoratedSignature() throws IOException, GeneralSecurityException {
        byte[] data = "data".getBytes();
        byte[] signature = {4, 5, 6};
        DecoratedSignature decoratedSignature = new KeyPair(new EdDSAPublicKey(data)).sign(data);
        assertNotNull(decoratedSignature);
    }

    @Test
    public void verify_GivenDataSignature

    ReturnsTrue() throws IOException, GeneralSecurityException {
        byte[] data = "data".getBytes();
        byte[] signature = {4, 5, 6};
        assertTrue(new KeyPair(new EdDSAPublicKey(data)).verify(data, signature));
    }

    @Test
    public void hashCode_GivenKeyPairReturnsUniqueHashCode() throws IOException, GeneralSecurityException {
        KeyPair keyPair1 = new KeyPair(new EdDSAPublicKey("seed1".getBytes()));
        KeyPair keyPair2 = new KeyPair(new EdDSAPublicKey("seed2".getBytes()));
        assertNotEquals(keyPair1.hashCode(), keyPair2.hashCode());
    }

    @Test
    public void equals_GivenTwoKeyPairsReturnsTrue() {
        KeyPair keyPair1 = new KeyPair(new EdDSAPublicKey("seed1".getBytes()));
        KeyPair keyPair2 = new KeyPair(new EdDSAPublicKey("seed1".getBytes()));
        assertTrue(keyPair1.equals(keyPair2));
    }

    @Test
    public void equals_GivenDifferentKeyPairsReturnsFalse() {
        KeyPair keyPair1 = new KeyPair(new EdDSAPublicKey("seed1".getBytes()));
        KeyPair keyPair2 = new KeyPair(new EdDSAPublicKey("seed2".getBytes()));
        assertFalse(keyPair1.equals(keyPair2));
    }

}