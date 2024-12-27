package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import java.security.PublicKey;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void canSignTest() {
        KeyPair keyPair = KeyPair.random();
        assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedCharArrayTest() {
        char[] seed = {'a', 'b', 'c'};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedStringTest() {
        String seed = "abc";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedBytesArrayTest() {
        byte[] seed = {1, 2, 3};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromAccountIdTest() {
        String accountId = "GCSU7HRVYVSFYH4F6U2TOR6TOSHXFD554APUHMJZMONRDG3SC3DZMZYL";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
    }

    @Test
    public void fromPublicKeyTest() {
        byte[] publicKey = {1, 2, 3};
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotNull(keyPair);
    }

    @Test
    public void randomTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
    }

    @Test
    public void getAccountIdTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getAccountId());
    }

    @Test
    public void getSecretSeedTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getSecretSeed());
    }

    @Test
    public void getPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getPublicKey());
    }

    @Test
    public void signTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = {1, 2, 3};
        assertNotNull(keyPair.sign(data));
    }

    @Test
    public void verifyTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = {1, 2, 3};
        byte[] signature = keyPair.sign(data);
        assertTrue(keyPair.verify(data, signature));
    }

    @Test
    public void equalsTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.fromSecretSeed(
                new String(keyPair1.getSecretSeed()));

        assertEquals(keyPair1, keyPair2);
    }

    @Test
    public void hashCodeTest() {
        KeyPair keyPair = KeyPair.random();
        assertEquals(keyPair.hashCode(), keyPair.getAccountId().hashCode());
    }

}