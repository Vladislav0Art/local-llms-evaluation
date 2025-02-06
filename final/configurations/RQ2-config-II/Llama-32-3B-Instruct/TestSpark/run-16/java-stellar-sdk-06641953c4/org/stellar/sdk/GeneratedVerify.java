package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedVerify {

    @Test
    public void verify() {
        // Arrange & Act
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        XdrDataOutputStream xdrDataOutputStream = new XdrDataOutputStream(bos);
        KeyPair keyPair = KeyPair.fromSecretSeed("my_secret_seed");
        byte[] data = "Hello, World!".getBytes();
        byte[] signature = "signature_bytes".getBytes();
        boolean result = keyPair.verify(data, signature);
        assertTrue(result);
    }

}