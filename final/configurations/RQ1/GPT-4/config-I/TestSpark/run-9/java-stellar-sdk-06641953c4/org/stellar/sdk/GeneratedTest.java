package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAEngine;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKeySpec;
import net.i2p.crypto.eddsa.EdDSAPrivateKeySpec;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveTable;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveSpec;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.mockito.Mockito;

import java.security.*;
import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void KeyPairPublicKeyConstructorTest() {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(publicKey);
        assertNotNull(keyPair);
    }

    @Test
    public void KeyPairPublicKeyPrivateKeyConstructorTest() {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        EdDSAPrivateKey privateKey = Mockito.mock(EdDSAPrivateKey.class);
        KeyPair keyPair = new KeyPair(publicKey, privateKey);
        assertTrue(keyPair.canSign());
        assertEquals(keyPair.getPublicKey(), publicKey.getAbyte());
    }

    @Test
    public void fromSecretSeedCharArrayTest() throws NoSuchAlgorithmException {
        String seed = "SACJC372QBSSKJYTV5AEPJPBWWIMXN7OYEFRZEZ6P3C4HQYU2SG47R3H";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed.toCharArray());
        Pair<byte[], byte[]> keyBytes = generateKeyBytes(seed);
        assertArrayEquals(keyPair.getPublicKey(), keyBytes.getLeft());
    }

    @Test
    public void fromSecretSeedByteArrayTest() throws NoSuchAlgorithmException {
        String seed = "SACJC372QBSSKJYTV5AEPJPBWWIMXN7OYEFRZEZ6P3C4HQYU2SG47R3H";
        Pair<byte[], byte[]> keyBytes = generateKeyBytes(seed);
        KeyPair keyPair = KeyPair.fromSecretSeed(keyBytes.getRight());
        assertArrayEquals(keyPair.getPublicKey(), keyBytes.getLeft());
    }

    @Test
    public void fromAccountIdTest() throws NoSuchAlgorithmException {
        String accountId = "GBVUDZLMHTLMZANLZB6PJMRY5QJ6GZSW7VFAI4HQSGZDLN47JUJQIN5Y";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        Pair<byte[], byte[]> keyBytes = generateKeyBytes(accountId);
        assertArrayEquals(keyPair.getPublicKey(), keyBytes.getLeft());
    }

    @Test
    public void fromPublicKeyTest() throws NoSuchAlgorithmException {
        String publicKeyStr = "GBVUDZLMHTLMZANLZB6PJMRY5QJ6GZSW7VFAI4HQSGZDLN47JUJQIN5Y";
        Pair<byte[], byte[]> keyBytes = generateKeyBytes(publicKeyStr);
        KeyPair keyPair = KeyPair.fromPublicKey(keyBytes.getLeft());
        assertEquals(publicKeyStr, keyPair.getPublicKey());
    }

}