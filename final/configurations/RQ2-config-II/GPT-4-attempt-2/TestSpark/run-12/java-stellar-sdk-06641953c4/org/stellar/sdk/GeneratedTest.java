package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void canSignTest() {
        KeyPair keyPair = KeyPair.random();
        boolean result = keyPair.canSign();
        assertTrue(result);
    }

    @Test
    public void fromSecretSeedCharArrayTest() {
        char[] seed = {'s', 'e', 'c', 'r', 'e', 't'};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedStringTest() {
        String seed = "secret";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedByteArrayTest() {
        byte[] seed = new byte[]{1, 2, 3, 4, 5};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromAccountIdTest() {
        String accountId = "accountId";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
    }

    @Test
    public void fromPublicKeyTest() {
        byte[] publicKey = new byte[]{1, 2, 3, 4, 5};
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotNull(keyPair);
    }

    @Test
    public void fromBip39SeedTest() {
        byte[] bip39Seed = new byte[]{1, 2, 3, 4, 5};
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, 1);
        assertNotNull(keyPair);
    }

    @Test
    public void getAccountIdTest() {
        KeyPair keyPair = KeyPair.random();
        String accountId = keyPair.getAccountId();
        assertNotNull(accountId);
    }

    @Test
    public void getSecretSeedTest() {
        KeyPair keyPair = KeyPair.random();
        char[] secretSeed = keyPair.getSecretSeed();
        assertNotNull(secretSeed);
    }

    @Test
    public void getPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] publicKey = keyPair.getPublicKey();
        assertNotNull(publicKey);
    }

    @Test
    public void getSignatureHintTest() {
        KeyPair keyPair = KeyPair.random();
        SignatureHint signatureHint = keyPair.getSignatureHint();
        assertNotNull(signatureHint);
    }

    @Test
    public void getXdrPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        PublicKey publicKey = keyPair.getXdrPublicKey();
        assertNotNull(publicKey);
    }

    @Test
    public void getXdrSignerKeyTest() {
        KeyPair keyPair = KeyPair.random();
        SignerKey signerKey = keyPair.getXdrSignerKey();
        assertNotNull(signerKey);
    }

    @Test
    public void fromXdrPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        PublicKey publicKey = keyPair.getXdrPublicKey();
        KeyPair keyPair2 = KeyPair.fromXdrPublicKey(publicKey);
        assertNotNull(keyPair2);
    }

    @Test
    public void fromXdrSignerKeyTest() {
        KeyPair keyPair = KeyPair.random();
        SignerKey signerKey = keyPair.getXdrSignerKey();
        KeyPair keyPair2 = KeyPair.fromXdrSignerKey(signerKey);
        assertNotNull(keyPair2);
    }

    @Test
    public void signTest() {
        byte[] data = new byte[]{1, 2, 3, 4, 5};
        KeyPair keyPair = KeyPair.random();
        byte[] signedData = keyPair.sign(data);
        assertNotNull(signedData);
    }

    @Test
    public void signDecoratedTest() {
        byte[] data = new byte[]{1, 2, 3, 4, 5};
        KeyPair keyPair = KeyPair.random();
        DecoratedSignature decoratedSignature = keyPair.signDecorated(data);
        assertNotNull(decoratedSignature);
    }

    @Test
    public void signPayloadDecoratedTest() {
        byte[] signerPayload = new byte[]{1, 2, 3, 4, 5};
        KeyPair keyPair = KeyPair.random();
        DecoratedSignature decoratedSignature = keyPair.signPayloadDecorated(signerPayload);
        assertNotNull(decoratedSignature);
    }

    @Test
    public void verifyTest() {
        byte[] data = new byte[]{1, 2, 3, 4, 5};
        KeyPair keyPair = KeyPair.random();
        byte[] signedData = keyPair.sign(data);
        boolean result = keyPair.verify(data, signedData);
        assertTrue(result);
    }

    @Test
    public void equalsTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = keyPair1;
        boolean result = keyPair1.equals(keyPair2);
        assertTrue(result);
    }

    @Test
    public void hashCodeTest() {
        KeyPair keyPair = KeyPair.random();
        int hashCode1 = keyPair.hashCode();
        int hashCode2 = keyPair.hashCode();
        assertEquals(hashCode1, hashCode2);
    }

}