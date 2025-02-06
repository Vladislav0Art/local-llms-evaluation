package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedCanSign {

    @Test
    public void canSign() {
        // Arrange & Act
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        XdrDataOutputStream xdrDataOutputStream = new XdrDataOutputStream(bos);
        KeyPair keyPair = KeyPair.fromSecretSeed("my_secret_seed");
        try {
            boolean result = keyPair.canSign();
            assertTrue(result);
        } catch (GeneralSecurityException | IOException e) {
            fail(e.getMessage());
        }
    }

}