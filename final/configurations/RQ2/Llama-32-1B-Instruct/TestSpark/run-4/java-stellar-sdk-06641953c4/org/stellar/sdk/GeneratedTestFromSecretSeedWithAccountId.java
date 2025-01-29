package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestFromSecretSeedWithAccountId {

    @Mock
    private EdDSAPublicKey mockEdDSAPublicKey;

    @Test
    public void testFromSecretSeedWithAccountId() {
        byte[] secretSeed = "some_secret_seed".getBytes();
        String accountId = "some_account_id".toString();
        KeyPair keyPair = KeyPair.fromSecretSeed(secretSeed, accountId);
        assertEquals(EdDSAEngine.generateEddsaFromSecretseed(secretSeed).getPublicKey(), keyPair.getPublicKey());
    }

}