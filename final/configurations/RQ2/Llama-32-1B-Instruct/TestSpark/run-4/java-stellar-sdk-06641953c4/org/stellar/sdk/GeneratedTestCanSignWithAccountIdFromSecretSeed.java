package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestCanSignWithAccountIdFromSecretSeed {

    @Mock
    private EdDSAPublicKey mockEdDSAPublicKey;

    @Test
    public void testCanSignWithAccountIdFromSecretSeed() {
        String secretSeed = "some_secret_seed";
        when(mockEdDSAEngine.generateEddsaFromSecretseed(secretSeed).getPublicKey()).thenReturn(mockEdDSAPublicKey);
        assertTrue(KeyPair.canSignWithAccountId(secretSeed));
    }

}