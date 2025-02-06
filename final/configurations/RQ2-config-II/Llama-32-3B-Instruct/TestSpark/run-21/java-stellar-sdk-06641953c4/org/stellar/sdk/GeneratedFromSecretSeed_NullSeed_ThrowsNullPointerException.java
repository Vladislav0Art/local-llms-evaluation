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

public class GeneratedFromSecretSeed_NullSeed_ThrowsNullPointerException {

    @Test
    public void fromSecretSeed_NullSeed_ThrowsNullPointerException() {
        try {
            KeyPair.fromSecretSeed(null);
            assert false;
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }

}