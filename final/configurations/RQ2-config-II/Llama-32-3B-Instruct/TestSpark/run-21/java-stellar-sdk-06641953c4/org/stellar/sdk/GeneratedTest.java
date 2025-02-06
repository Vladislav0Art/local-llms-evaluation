package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.KeyPairGenerator;

import static org.mockito.Mockito.*;

import java.util.Base64;

public class GeneratedTest {

    @Test
    public void canSign_EmptySecretSeed_ReturnsFalse() {
        KeyPair keyPair = new KeyPair(new EdDSAPrivateKey());
        assertFalse(keyPair.canSign());
    }

    @Test
    public void fromSecretSeed_EmptySeed_ThrowsNullPointerException() {
        try {
            KeyPair.fromSecretSeed(new char[0]);
            assert false;
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }

    @Test
    public void fromSecretSeed_NullSeed_ThrowsNullPointerException() {
        try {
            KeyPair.fromSecretSeed(null);
            assert false;
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }

    @Test
    public void fromAccountId_NullAccountId_ThrowsNullPointerException() {
        try {
            KeyPair.fromAccountId(null);
            assert false;
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }

    @Test
    public void fromXdrPublicKey_NullKey_ThrowsNullPointerException() {
        try {
            KeyPair.fromXdrPublicKey(null);
            assert false;
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }

    @Test
    public void sign_EmptyData_ReturnsByteArrayWithZeroLength() {
        KeyPair keyPair = new KeyPair(new EdDSAPrivateKey());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] signature = keyPair.sign(out.getBytes());
        assertEquals(0, signature.length);
    }

    @Test
    public void verify_EmptyData_ReturnsTrueWithZeroSignatureLength() {
        KeyPair keyPair = new KeyPair(new EdDSAPrivateKey());
        assertTrue(keyPair.verify(new Uint256(), new byte[0]));
    }

    @Test
    public void equals_HasSamePublicAndPrivateKeys_ReturnsTrue() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey();
        EdDSAPrivateKey privateKey = new EdDSAPrivateKey();
        KeyPair keyPair1 = new KeyPair(publicKey);
        KeyPair keyPair2 = new KeyPair(privateKey);
        assertTrue(keyPair1.equals(keyPair2));
    }

}

public class KeyPair {
    // ...
    public boolean canSign() { /* implementation */ }

    public static KeyPair fromSecretSeed(char[] seed) { /* implementation */ }

    public static KeyPair fromXdrPublicKey(PublicKey key) { /* implementation */ }

    public byte[] sign(byte[] data) { /* implementation */ }

    public DecoratedSignature signDecorated(byte[] data) { /* implementation */
    }

}