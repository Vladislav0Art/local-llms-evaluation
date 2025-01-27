package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.MessageDigest;
import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void [KeyPairConstructor_SinglePublicKeyConstruction_Test]()

    {
        EdDSAPublicKey publicKey = EdDSAPublicKey.of("ed25519");
        KeyPair keyPair = new KeyPair(publicKey);
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void [KeyPairConstructor_DuplicatePublicKeyConstruction_Test]()

    {
        EdDSAPublicKey publicKey = EdDSAPublicKey.of("ed25519");
        KeyPair keyPair1 = new KeyPair(publicKey);
        KeyPair keyPair2 = new KeyPair(publicKey);
        assertEquals(keyPair1, keyPair2);
    }

    @Test
    public void [KeyPairConstructor_NullPublicKeyConstruction_Test]()

    {
        assertThrows(NullPointerException.class, () -> new KeyPair(null));
    }

    @Test
    public void [KeyPairFromSecretSeed_SingleByteSeedConstruction_Test]()

    {
        char[] seed = "byte".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void [KeyPairFromSecretSeed_NullSeedConstruction_Test]()

    {
        assertThrows(NullPointerException.class, () -> KeyPair.fromSecretSeed(null));
    }

    @Test
    public void [KeyPairFromAccountId_NullAccountIdConstruction_Test]()

    {
        assertThrows(NullPointerException.class, () -> KeyPair.fromAccountId(null));
    }

    @Test
    public void [KeyPairFromBip39Seed_SingleByteSeedConstruction_Test]()

    {
        byte[] bip39Seed = "byte".getBytes();
        int accountNumber = 0;
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, accountNumber);
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void [KeyPairRandom_Construction_Test]()

    {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void [KeyPairGetAccountId_NullPublicKeyConstruction_Test]()

    {
        assertThrows(NullPointerException.class, () -> ((KeyPair) KeyPair.fromPublicKey(new byte[0])).getAccountId());
    }

    @Test
    public void [KeyPairGetSecretSeed_NullPublicKeyConstruction_Test]()

    {
        assertThrows(NullPointerException.class, () -> ((KeyPair) KeyPair.fromPublicKey(new byte[0])).getSecretSeed());
    }

    @Test
    public void [KeyPairGetPublicKey_NullPublicKeyConstruction_Test]()

    {
        assertThrows(NullPointerException.class, () -> ((KeyPair) KeyPair.fromPublicKey(new byte[0])).getPublicKey());
    }

    @Test
    public void [KeyPairSign_ByteArraySignature_Test]()

    {
        KeyPair keyPair = KeyPair.random();
        byte[] data = "data".getBytes();
        byte[] signature = keyPair.sign(data);
        assertNotNull(signature);
        assertTrue(Arrays.equals(keyPair.sign(data), signature));
    }

    @Test
    public void [KeyPairVerify_ByteArrayVerificationResult_Test]()

    {
        KeyPair keyPair = KeyPair.random();
        byte[] data = "data".getBytes();
        byte[] signature = ((KeyPair) KeyPair.fromPublicKey(new byte[0])).sign(data);
        assertTrue(keyPair.verify(data, signature));
        assertFalse(keyPair.verify(data, new byte[0]));
    }

    @Test
    public void [KeyPairGetHashCode_Test]()

    {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.random();
        assertNotEquals(keyPair1.hashCode(), keyPair2.hashCode());
    }

}