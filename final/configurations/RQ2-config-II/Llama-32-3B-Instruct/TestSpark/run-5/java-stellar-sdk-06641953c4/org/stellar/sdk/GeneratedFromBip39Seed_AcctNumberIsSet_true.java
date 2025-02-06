package org.stellar.sdk;

public class GeneratedFromBip39Seed_AcctNumberIsSet_true {

    @Test
    public void fromBip39Seed_AcctNumberIsSet_true() throws Exception {
        byte[] bip39Seed = "bip39seed".getBytes();
        int accountNumber = 1;
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, accountNumber);
        assertNotNull(keyPair.getAccountId());
    }

}