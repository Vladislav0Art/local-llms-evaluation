package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestFromSecretSeedWithBip39Seed {

    @Mock
    private EdDSAPublicKey mockEdDSAPublicKey;

    @Test
    public void testFromSecretSeedWithBip39Seed() {
        byte[] secretSeed = "some_secret_seed".getBytes();
        byte[] bip39Seed = "some_bip39_seed".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(secretSeed, bip39Seed);
        assertEquals(EdDSAEngine.generateEddsaFromSecretseed(secretSeed).getPublicKey(), keyPair.getPublicKey());
    }

}