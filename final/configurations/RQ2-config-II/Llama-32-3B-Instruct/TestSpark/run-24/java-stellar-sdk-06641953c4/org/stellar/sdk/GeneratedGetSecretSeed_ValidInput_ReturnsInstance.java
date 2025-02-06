package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetSecretSeed_ValidInput_ReturnsInstance {

    @Test
    public void getSecretSeed_ValidInput_ReturnsInstance() throws GeneralSecurityException {
        byte[] seed = new byte[16];
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair.getSecretSeed());
    }

}