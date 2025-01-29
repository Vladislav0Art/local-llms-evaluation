package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestCanSignWithAccountId {

    @Mock
    private EdDSAPublicKey mockEdDSAPublicKey;

    @Test
    public void testCanSignWithAccountId() {
        String secretSeed = "some_secret_seed";
        KeyPair keyPair = new KeyPair();
        when(mockEdDSAEngine.generateEddsaFromSecretseed(secretSeed).getPublicKey()).thenReturn(mockEdDSAPublicKey);
        assertTrue(KeyPair.canSignWithAccountId(secretSeed, keyPair));
    }

}