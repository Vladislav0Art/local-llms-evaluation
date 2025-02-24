package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.stellar.sdk.KeyPair;

public class GeneratedTest {

    @Test
    public void canSignTest() {
        KeyPair keyPair = new KeyPair(null);
        boolean canSign = keyPair.canSign();
        assertTrue(canSign);
    }

    @Test
    public void getAccountIdTest() {
        KeyPair keyPair = new KeyPair(null);
        String accountId = keyPair.getAccountId();
        assertNotNull(accountId);
    }

    @Test
    public void getSecretSeedTest() {
        KeyPair keyPair = new KeyPair(null);
        char[] secretSeed = keyPair.getSecretSeed();
        assertNotNull(secretSeed);
    }

    @Test
    public void getPublicKeyTest() {
        KeyPair keyPair = new KeyPair(null);
        byte[] publicKey = keyPair.getPublicKey();
        assertNotNull(publicKey);
    }

    @Test
    public void getSignatureHintTest() {
        KeyPair keyPair = new KeyPair(null);
        SignatureHint signatureHint = keyPair.getSignatureHint();
        assertNotNull(signatureHint);
    }

    @Test
    public void getXdrPublicKeyTest() {
        KeyPair keyPair = new KeyPair(null);
        PublicKey xdrPublicKey = keyPair.getXdrPublicKey();
        assertNotNull(xdrPublicKey);
    }

    @Test
    public void getXdrSignerKeyTest() {
        KeyPair keyPair = new KeyPair(null);
        SignerKey xdrSignerKey = keyPair.getXdrSignerKey();
        assertNotNull(xdrSignerKey);
    }

    @Test
    public void signTest() {
        KeyPair keyPair = new KeyPair(null);
        byte[] data = new byte[10];
        byte[] signature = keyPair.sign(data);
        assertNotNull(signature);
    }

}