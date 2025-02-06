package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void newKeyPair_ReturnsInstance() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
    }

    @Test
    public void canSign

    returnsFalseIfPublicKeyIsNull() {
        KeyPair keyPair = KeyPair.fromPublickey(null);
        assertFalse(keyPair.canSign());
    }

    @Test
    public void fromSecretSeed

    ReturnsInstanceWithCorrectSize() throws GeneralSecurityException {
        byte[] seed = "my_seed".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertEquals(32, keyPair.getPublicKey().length);
    }

    @Test
    public void fromAccountId

    ReturnsInstanceWithCorrectXdrPublicKey() throws IOException {
        String accountId = "account_id";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair.getXdrPublicKey());
    }

    @Test
    public void getSecretSeed_ReturnsCorrectValue() {
        byte[] seed = "my_seed".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertEquals(seed, keyPair.getSecretSeed());
    }

    @Test
    public void getPublicKey

    ReturnsCorrectXdrPublicKey() {
        byte[] publicKey = {1, 2, 3};
        KeyPair keyPair = KeyPair.fromPublickey(publicKey);
        assertNotNull(keyPair.getXdrPublicKey());
        assertTrue(Arrays.equals(publicKey, keyPair.getXdrPublicKey().getBytes()));
    }

    @Test
    public void sign

    ReturnsCorrectSignature() throws GeneralSecurityException {
        byte[] data = "my_data".getBytes();
        byte[] signature = {1, 2, 3};
        KeyPair keyPair = KeyPair.fromSecretSeed("my_seed".getBytes());
        byte[] expectedSignature = keyPair.sign(data);
        assertTrue(Arrays.equals(signature, expectedSignature));
    }

    @Test
    public void verify

    ReturnsCorrectVerificationResult() throws GeneralSecurityException {
        byte[] data = "my_data".getBytes();
        byte[] signature = {1, 2, 3};
        KeyPair keyPair = KeyPair.fromSecretSeed("my_seed".getBytes());
        boolean expectedVerificationResult = true;
        boolean result = keyPair.verify(data, signature);
        assertTrue(result == expectedVerificationResult);
    }

}