package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;
import java.io.ByteArrayOutputStream;

public class GeneratedGetPublicKey {

    @Test
    public void getPublicKey() {
        byte[] publicKey = "publickey".getBytes();
        KeyPair keyPair = new KeyPair(null); // constructor not used here, just a placeholder
        assertNotNull(keyPair.getPublicKey());
    }

}