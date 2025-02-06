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

public class GeneratedSign_EmptyData_ReturnsByteArrayWithZeroLength {

    @Test
    public void sign_EmptyData_ReturnsByteArrayWithZeroLength() {
        KeyPair keyPair = new KeyPair(new EdDSAPrivateKey());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] signature = keyPair.sign(out.getBytes());
        assertEquals(0, signature.length);
    }

}