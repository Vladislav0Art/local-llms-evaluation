package org.stellar.sdk;

public class GeneratedFromBip39Seed_AcctNumberIsInvalid_false {

    @Test
    public void fromBip39Seed_AcctNumberIsInvalid_false() throws Exception {
        byte[] bip39Seed = "bip39seed".getBytes();
        int accountNumber = 0;
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, accountNumber);
        assertNull(keyPair.getAccountId());
    }

}