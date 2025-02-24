package org.stellar.sdk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedTest {

    @Test
    public void canSignTest() throws Exception {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        boolean canSign = keyPair.canSign();
        assertTrue(canSign);
    }

    @Test
    public void fromSecretSeedTest() throws Exception {
        char[] seed = {'a', 'b', 'c'};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertEquals(keyPair.getSecretSeed(), seed);
    }

    @Test
    public void fromSecretSeedTest2() throws Exception {
        String seed = "abc";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertEquals(keyPair.getSecretSeed(), seed.toCharArray());
    }

    @Test
    public void fromSecretSeedTest3() throws Exception {
        byte[] seed = new byte[]{(byte) 'a', (byte) 'b', (byte) 'c'};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertEquals(keyPair.getPublicKey(), seed);
    }

    @Test
    public void fromAccountIdTest() throws Exception {
        String accountId = "abc";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertEquals(keyPair.getAccountId(), accountId);
    }

    @Test
    public void fromPublicKeyTest() throws Exception {
        byte[] publicKey = new byte[]{(byte) 'a', (byte) 'b', (byte) 'c'};
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertEquals(keyPair.getPublicKey(), publicKey);
    }

}