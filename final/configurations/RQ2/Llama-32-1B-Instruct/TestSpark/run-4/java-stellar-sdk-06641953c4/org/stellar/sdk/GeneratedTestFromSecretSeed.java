package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestFromSecretSeed {

    @Mock
    private EdDSAPublicKey mockEdDSAPublicKey;

    @Test
    public void testFromSecretSeed() {
        byte[] secretSeed = "some_secret_seed".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(secretSeed);
        assertEquals(EdDSAEngine.generateEddsaFromSecretseed(secretSeed).getPublicKey(), keyPair.getPublicKey());
    }

}