package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestCanSignFromSecretSeedToAccountWithBip39Seed {

    @Mock
    private EdDSAPublicKey mockEdDSAPublicKey;

    @Test
    public void testCanSignFromSecretSeedToAccountWithBip39Seed() {
        String secretSeed = "some_secret_seed";
        String accountId = "some_account_id";
        KeyPair keyPair = new KeyPair();
        when(mockEdDSAEngine.generateEddsaFromSecretseed(secretSeed).getPublicKey()).thenReturn(mockEdDSAPublicKey);
        assertTrue(KeyPair.canSignFromSecretSeedToAccount(secretSeed, accountId, keyPair));
    }

}