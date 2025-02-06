package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeedValidSeedWorks {

    @Test
    public void fromSecretSeedValidSeedWorks() throws GeneralSecurityException, IOException {
        char[] seed = "valid_seed".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair.getPublicKey());
    }

}