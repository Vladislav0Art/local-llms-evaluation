package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestCanSignFromSecretSeed {

    @Mock
    private EdDSAPublicKey mockEdDSAPublicKey;

    @Test
    public void testCanSignFromSecretSeed() {
        String secretSeed = "some_secret_seed";
        KeyPair keyPair = new KeyPair();
        when(mockEdDSAEngine.generateEddsaFromSecretseed(secretSeed).getPublicKey()).thenReturn(mockEdDSAPublicKey);
        assertTrue(KeyPair.canSignFromSecretSeed(secretSeed, keyPair));
    }

}