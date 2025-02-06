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

public class GeneratedVerify_EmptyData_ReturnsTrueWithZeroSignatureLength {

    @Test
    public void verify_EmptyData_ReturnsTrueWithZeroSignatureLength() {
        KeyPair keyPair = new KeyPair(new EdDSAPrivateKey());
        assertTrue(keyPair.verify(new Uint256(), new byte[0]));
    }

}