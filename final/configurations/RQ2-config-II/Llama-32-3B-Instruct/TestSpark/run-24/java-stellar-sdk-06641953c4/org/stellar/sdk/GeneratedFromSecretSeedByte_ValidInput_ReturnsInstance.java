package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeedByte_ValidInput_ReturnsInstance {

    @Test
    public void fromSecretSeedByte_ValidInput_ReturnsInstance() throws GeneralSecurityException {
        byte[] seed = new byte[16];
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}