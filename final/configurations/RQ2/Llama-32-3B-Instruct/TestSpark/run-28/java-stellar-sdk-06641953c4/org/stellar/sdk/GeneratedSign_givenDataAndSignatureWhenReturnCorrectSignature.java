package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;
import java.io.ByteArrayOutputStream;

public class GeneratedSign_givenDataAndSignatureWhenReturnCorrectSignature {

    @Test
    public void sign_givenDataAndSignatureWhenReturnCorrectSignature() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        XdrDataOutputStream writer = new XdrDataOutputStream(out);
        KeyPair keyPair = new KeyPair(null); // constructor not used here, just a placeholder
        byte[] signature = "signature".getBytes();
        byte[] data = "data".getBytes();
        assertTrue(keyPair.sign(data).equals(signature));
    }

}