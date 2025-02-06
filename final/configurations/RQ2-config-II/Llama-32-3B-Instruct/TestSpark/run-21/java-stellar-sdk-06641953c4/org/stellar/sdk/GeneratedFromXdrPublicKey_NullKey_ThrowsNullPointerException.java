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

public class GeneratedFromXdrPublicKey_NullKey_ThrowsNullPointerException {

    @Test
    public void fromXdrPublicKey_NullKey_ThrowsNullPointerException() {
        try {
            KeyPair.fromXdrPublicKey(null);
            assert false;
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }

}