package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testGetAccountId() {
        KeyPair keyPair = new KeyPair();
        String accountId = keyPair.getAccountId();
        assertEquals("expected accountId", accountId);
    }

    @Test
    public void testGetSecretSeed() {
        KeyPair keyPair = new KeyPair();
        char[] secretSeed = keyPair.getSecretSeed();
        assertEquals("expected secretSeed", secretSeed);
    }

    @Test
    public void testGetPublicKey() {
        KeyPair keyPair = new KeyPair();
        byte[] publicKey = keyPair.getPublicKey();
        assertEquals("expected publicKey", publicKey);
    }

}