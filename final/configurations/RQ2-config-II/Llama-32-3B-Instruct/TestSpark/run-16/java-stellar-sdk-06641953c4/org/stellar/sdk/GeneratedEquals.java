package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedEquals {

    @Test
    public void equals() {
        // Arrange & Act
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        XdrDataOutputStream xdrDataOutputStream = new XdrDataOutputStream(bos);
        KeyPair keyPair1 = KeyPair.fromSecretSeed("my_secret_seed");
        KeyPair keyPair2 = KeyPair.fromSecretSeed("my_secret_seed");
        boolean result = keyPair1.equals(keyPair2);
        assertTrue(result);
    }

}