package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.GeneralSecurityException;
import java.util.Random;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void randomTest() {
        assertNotNull(KeyPair.random());
    }

    @Test
    public void fromPublicKeyNullTest() {
        KeyPair.fromPublicKey(null);
    }

    @Test
    public void fromSecretSeedByteArrayNullTest() {
        KeyPair.fromSecretSeed((byte[]) null);
    }

    @Test
    public void fromSecretSeedCharArrayNullTest() {
        KeyPair.fromSecretSeed((char[]) null);
    }

    @Test
    public void fromSecretSeedStringNullTest() {
        KeyPair.fromSecretSeed((String) null);
    }

    @Test
    public void fromSecretSeedByteArrayTest() {
        KeyPair pair = KeyPair.random();
        char[] seed = pair.getSecretSeed();
        KeyPair restoredPair = KeyPair.fromSecretSeed(new String(seed).getBytes());
        assertEquals(pair.getAccountId(), restoredPair.getAccountId());
    }

    @Test
    public void fromSecretSeedCharArrayTest() {
        KeyPair pair = KeyPair.random();
        char[] seed = pair.getSecretSeed();
        KeyPair restoredPair = KeyPair.fromSecretSeed(seed);
        assertEquals(pair.getAccountId(), restoredPair.getAccountId());
    }

    @Test
    public void fromSecretSeedStringTest() {
        KeyPair pair = KeyPair.random();
        char[] seed = pair.getSecretSeed();
        KeyPair restoredPair = KeyPair.fromSecretSeed(new String(seed));
        assertEquals(pair.getAccountId(), restoredPair.getAccountId());
    }

    @Test
    public void verifyInvalidSignatureTest() {
        KeyPair pair = KeyPair.random();
        assertFalse(pair.verify("Hello world".getBytes(), "InvalidSignature".getBytes()));
    }

    @Test
    public void fromAccountIdInvalidTest() {
        assertNull(KeyPair.fromAccountId("Invalid accountId"));
    }

    @Test
    public void fromAccountIdTest() {
        KeyPair pair = KeyPair.random();
        KeyPair restoredPair = KeyPair.fromAccountId(pair.getAccountId());
        assertEquals(pair.getAccountId(), restoredPair.getAccountId());
    }

    @Test
    public void fromPublicKeyTest() {
        KeyPair pair = KeyPair.random();
        KeyPair restoredPair = KeyPair.fromPublicKey(pair.getPublicKey());
        assertArrayEquals(pair.getPublicKey(), restoredPair.getPublicKey());
    }

    @Test
    public void fromXdrPublicKeyTest() {
        KeyPair pair = KeyPair.random();
        PublicKey key = pair.getXdrPublicKey();
        KeyPair restoredPair = KeyPair.fromXdrPublicKey(key);
        assertEquals(pair, restoredPair);
    }

    @Test
    public void fromXdrSignerKeyTest() {
        KeyPair pair = KeyPair.random();
        SignerKey key = pair.getXdrSignerKey();
        KeyPair restoredPair = KeyPair.fromXdrSignerKey(key);
        assertEquals(pair, restoredPair);
    }

    @Test
    public void canSignTest() {
        assertTrue(KeyPair.random().canSign());
    }

    @Test
    public void getAccountIdTest() {
        assertNotNull(KeyPair.random().getAccountId());
    }

    @Test
    public void getSecretSeedTest() {
        assertNotNull(KeyPair.random().getSecretSeed());
    }

    @Test
    public void fromBip39SeedNullTest() {
        assertNull(KeyPair.fromBip39Seed(null, new Random().nextInt()));
    }

    @Test
    public void fromBip39SeedTest() {
        byte[] seed = KeyPair.random().getPublicKey();
        int account = new Random().nextInt();
        assertNotNull(KeyPair.fromBip39Seed(seed, account));
    }

    @Test
    public void signTest() {
        byte[] data = "Hello world".getBytes();
        KeyPair pair = KeyPair.random();
        assertNotNull(pair.sign(data));
    }

    @Test
    public void signDecoratedTest() {
        byte[] data = "Hello world".getBytes();
        KeyPair pair = KeyPair.random();
        assertNotNull(pair.signDecorated(data));
    }

    @Test
    public void signPayloadDecoratedTest() {
        byte[] data = "Hello world".getBytes();
        KeyPair pair = KeyPair.random();
        assertNotNull(pair.signPayloadDecorated(data));
    }

    @Test
    public void verifyTest() {
        byte[] data = "Hello world".getBytes();
        KeyPair pair = KeyPair.random();
        byte[] signature = pair.sign(data);
        assertTrue(pair.verify(data, signature));
    }

    @Test
    public void equalsTest() {
        KeyPair pair1 = KeyPair.random();
        KeyPair pair2 = KeyPair.fromPublicKey(pair1.getPublicKey());
        assertTrue(pair1.equals(pair2));
    }

    @Test
    public void hashCodeTest() {
        KeyPair pair1 = KeyPair.random();
        KeyPair pair2 = KeyPair.fromPublicKey(pair1.getPublicKey());
        assertEquals(pair1.hashCode(), pair2.hashCode());
    }

}