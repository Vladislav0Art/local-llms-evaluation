package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void testCanSign() {
        KeyPair keyPair = new KeyPair(null);
        assertFalse(keyPair.canSign());
    }

    @Test
    public void testFromSecretSeed() {
        KeyPair keyPair = KeyPair.fromSecretSeed("secret");
        assertNotNull(keyPair);
    }

    @Test
    public void testFromAccountId() {
        KeyPair keyPair = KeyPair.fromAccountId("accountId");
        assertNotNull(keyPair);
    }

    @Test
    public void testFromPublicKey() {
        KeyPair keyPair = KeyPair.fromPublicKey(new byte[0]);
        assertNotNull(keyPair);
    }

    @Test
    public void testFromBip39Seed() {
        KeyPair keyPair = KeyPair.fromBip39Seed(new byte[0], 0);
        assertNotNull(keyPair);
    }

    @Test
    public void testRandom() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
    }

    @Test
    public void testGetAccountId() {
        KeyPair keyPair = new KeyPair(null);
        assertEquals("", keyPair.getAccountId());
    }

    @Test
    public void testGetSecretSeed() {
        KeyPair keyPair = new KeyPair(null);
        assertEquals(0, keyPair.getSecretSeed().length);
    }

}