package org.stellar.sdk;

public class GeneratedTestFromBip39Seed_1_2 {

    @Test
    public void testFromBip39Seed_1_2() {
        String bip39Seed = "secrets-seed-1-2";
        KeyPair key = KeyPair.fromBip39Seed(bip39Seed, 0);
        Preconditions.assertSame("xdr", key.getTypes());
    }

}