package org.stellar.sdk;

import org.junit.Test;

public class GeneratedTestFromSecretSeed_SeedNotEncrypted {

    @Test
    public void testFromSecretSeed_SeedNotEncrypted() {
        byte[] seed = "your_secret_seed_here".getBytes();
        KeyPair keyPair = fromSecretSeed(seed);
        assert keyPair.getAccountId().equals("your_account_id_here") : "Key pair created with invalid seed";
    }

}