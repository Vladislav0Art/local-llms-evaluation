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

public class GeneratedEquals_HasSamePublicAndPrivateKeys_ReturnsTrue {

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