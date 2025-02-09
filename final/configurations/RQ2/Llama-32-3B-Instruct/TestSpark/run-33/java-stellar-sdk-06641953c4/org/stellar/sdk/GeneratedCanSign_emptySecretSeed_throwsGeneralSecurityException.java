package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedCanSign_emptySecretSeed_throwsGeneralSecurityException {

    @Test
    public void canSign_emptySecretSeed_throwsGeneralSecurityException() {
        KeyPair keyPair = KeyPair.fromSecretSeed("");
        try {
            keyPair.canSign();
            fail("Expected GeneralSecurityException");
        } catch (GeneralSecurityException e) {
            // Expected
        }
    }

}