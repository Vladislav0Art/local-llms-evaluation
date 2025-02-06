package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSign {

    @Test
    public void sign() {
        // Arrange & Act
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        XdrDataOutputStream xdrDataOutputStream = new XdrDataOutputStream(bos);
        KeyPair keyPair = KeyPair.fromSecretSeed("my_secret_seed");
        byte[] data = "Hello, World!".getBytes();
        byte[] signature = keyPair.sign(data);
        // Verify signature correctness
    }

}