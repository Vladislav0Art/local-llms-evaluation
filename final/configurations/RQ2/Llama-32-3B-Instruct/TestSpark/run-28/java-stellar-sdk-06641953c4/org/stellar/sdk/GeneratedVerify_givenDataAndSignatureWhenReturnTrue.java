package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;
import java.io.ByteArrayOutputStream;

public class GeneratedVerify_givenDataAndSignatureWhenReturnTrue {

    @Test
    public void verify_givenDataAndSignatureWhenReturnTrue() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        XdrDataOutputStream writer = new XdrDataOutputStream(out);
        KeyPair keyPair = new KeyPair(null); // constructor not used here, just a placeholder
        byte[] signature = "signature".getBytes();
        byte[] data = "data".getBytes();
        assertTrue(keyPair.verify(data, signature));
    }

}