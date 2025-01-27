package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedNewKeyPairIsValid {

    @Test
    public void newKeyPairIsValid() {
        // Arrange and Act
        KeyPair keyPair = KeyPair.random();

        // Assert
        assertTrue(keyPair.canSign());
    }

}