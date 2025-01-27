package org.stellar.sdk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedFromBip39Seed_ValidBip39Seed_ReturnsKeyPair {

    @Test
    public void fromBip39Seed_ValidBip39Seed_ReturnsKeyPair() throws Exception {
        Bip39Seed bip39Seed = new Bip39Seed("valid-bip39-seed");
        KeyPair keyPair = Llama32_3B_Instruct_TestSpark.generateFromBip39seed(bip39Seed);
        assertNotNull(keyPair.getPublic());
    }

}