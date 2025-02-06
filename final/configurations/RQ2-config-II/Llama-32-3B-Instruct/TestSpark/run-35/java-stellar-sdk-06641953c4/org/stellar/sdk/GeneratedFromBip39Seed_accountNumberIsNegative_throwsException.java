package org.stellar.sdk;

public class GeneratedFromBip39Seed_accountNumberIsNegative_throwsException {

    @Test
    public void fromBip39Seed_accountNumberIsNegative_throwsException() throws Exception {
        byte[] bip39Seed = new byte[]{1, 2, 3};
        assertThrows(GeneralSecurityException.class, () -> KeyPair.fromBip39Seed(bip39Seed, -1));
    }

}