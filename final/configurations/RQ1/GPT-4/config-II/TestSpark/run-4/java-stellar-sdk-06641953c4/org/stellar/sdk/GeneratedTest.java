package org.stellar.sdk;

import net.i2p.crypto.eddsa.*;
import net.i2p.crypto.eddsa.spec.EdDSAPrivateKeySpec;
import net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.Uint256;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Signature;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void KeyPairProviderKeysTest() {
        EdDSAPublicKey publicKey = generatePublicKey();
        EdDSAPrivateKey privateKey = generatePrivateKey();
        KeyPair keyPair = new KeyPair(publicKey, privateKey);
        assertNotNull(keyPair);
        assertEquals(publicKey, keyPair.getPublicKey());
        assertEquals(privateKey, keyPair.getPrivateKey());
    }

    @Test
    public void KeyPairProviderPublicKeyOnlyTest() {
        EdDSAPublicKey publicKey = generatePublicKey();
        KeyPair keyPair = new KeyPair(publicKey);
        assertNotNull(keyPair);
        assertEquals(publicKey, keyPair.getPublicKey());
        assertNull(keyPair.getPrivateKey());
    }

    @Test
    public void CanSignTest() {
        EdDSAPublicKey publicKey = generatePublicKey();
        KeyPair keyPair = new KeyPair(publicKey);
        assertFalse(keyPair.canSign());

        EdDSAPrivateKey privateKey = generatePrivateKey();
        keyPair = new KeyPair(publicKey, privateKey);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedEncodedTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed("SBUV3MRGZURLG2ZTA2QOKUYNS4T2JX2KH6FBDAHVDIOHYUM5ERIJV7JZ".toCharArray());
        assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedInvalidTest() {
        KeyPair.fromSecretSeed("InvalidSeed".getBytes());
    }

    @Test
    public void fromPublicKeyTest() {
        EdDSAPublicKey publicKey = generatePublicKey();
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey.getAbyte());

        assertNotNull(keyPair);
        Assert.assertArrayEquals(publicKey.getAbyte(), keyPair.getPublicKey());
    }

    @Test
    public void SignWithoutPrivateKeyTest() {
        KeyPair keyPair = KeyPair.random();
        keyPair.sign("Message".getBytes());
    }

    @Test
    public void equalsTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.random();

        assertFalse(keyPair1.equals(keyPair2));
        assertTrue(keyPair1.equals(keyPair1));
        assertFalse(keyPair1.equals(null));
    }

    private EdDSAPublicKey generatePublicKey() {
        return new EdDSAPublicKey(new EdDSAPublicKeySpec("publicKey".getBytes(), ed25519));
    }

    private EdDSAPrivateKey generatePrivateKey() {
        return new EdDSAPrivateKey(new EdDSAPrivateKeySpec("privateKey".getBytes(), ed25519));
    }

}