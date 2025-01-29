package org.stellar.sdk;

public class GeneratedTestFromBip39Seed_SeedNotSerialized {

    @Test
    public void testFromBip39Seed_SeedNotSerialized() {
        byte[] seed = new byte[0];
        KeyPair keyPair = fromBip39Seed(seed, 1);
        assert keyPair.getAccountId().equals("your_account_id_here") : "Key pair created with invalid seed";
    }

}