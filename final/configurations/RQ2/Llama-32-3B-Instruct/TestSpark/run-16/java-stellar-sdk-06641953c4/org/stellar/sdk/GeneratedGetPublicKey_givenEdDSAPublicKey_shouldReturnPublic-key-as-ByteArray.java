package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedGetPublicKey_givenEdDSAPublicKey_shouldReturnPublic-key-as-

ByteArray {

    @Test
    public void getPublicKey_givenEdDSAPublicKey_shouldReturnPublic -key - as - ByteArray() throws
    GeneralSecurityException {
        EdDSAPrivateKey private_key = new EdDSAPrivateKey();
        EdDSAPublicKey public_key = new EdDSAPublicKey();
        KeyPair key_pair = new KeyPair(public_key);
        byte[] expected_public_key = public_key.getEncoded();
        assertArrayEquals(expected_public_key, key_pair.getPublicKey());
    }

}