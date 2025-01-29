package org.stellar.sdk;

import org.junit.Test;

public class GeneratedTestFromSecretSeed_SeedNotSerialized_InvalidSeed {

    @Test
    public void testFromSecretSeed_SeedNotSerialized_InvalidSeed() {
        char[] seed = "your_secret_seed_here".toCharArray();
        KeyPair keyPair = fromSecretSeed(seed);
        assert keyPair.getAccountId().equals("your_account_id_here") : "Key pair created with invalid seed";
    }

}