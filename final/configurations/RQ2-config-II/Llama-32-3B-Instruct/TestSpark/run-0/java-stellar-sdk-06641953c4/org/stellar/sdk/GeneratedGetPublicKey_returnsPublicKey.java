package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.security.GeneralSecurityException;

public class GeneratedGetPublicKey_returnsPublicKey {

    @Test
    public void getPublicKey_returnsPublicKey() {
        byte[] publicKey = {1, 2, 3};
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        byte[] expectedPublicKey = keyPair.getPublicKey();
        assertArrayEquals(expectedPublicKey, publicKey);
    }

}