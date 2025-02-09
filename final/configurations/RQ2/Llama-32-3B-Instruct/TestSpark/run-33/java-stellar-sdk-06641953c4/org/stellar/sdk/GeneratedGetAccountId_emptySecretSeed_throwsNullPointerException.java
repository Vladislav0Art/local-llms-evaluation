package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedGetAccountId_emptySecretSeed_throwsNullPointerException {

    @Test
    public void getAccountId_emptySecretSeed_throwsNullPointerException() {
        char[] seed = "";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertThrows(NullPointerException.class, () -> keyPair.getAccountId());
    }

}