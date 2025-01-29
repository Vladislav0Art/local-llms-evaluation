package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestFromSecretSeed_Bip39Seed {

    @Test
    public void testFromSecretSeed_Bip39Seed() {
        byte[] bip39Seed = "bip39_seed".getBytes();
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, 0);
        assertNotNull(keyPair.getSecretSeed());
        assertNull(keyPair.getPublicKey());
    }

}