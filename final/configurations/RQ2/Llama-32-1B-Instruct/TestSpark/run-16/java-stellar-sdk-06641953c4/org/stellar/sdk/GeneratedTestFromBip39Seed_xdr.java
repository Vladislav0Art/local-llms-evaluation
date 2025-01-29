package org.stellar.sdk;

public class GeneratedTestFromBip39Seed_xdr {

    @Test
    public void testFromBip39Seed_xdr() throws Exception {
        byte[] bip39Seed = "bip39 seed".getBytes();
        int accountNumber = 123;
        KeyPair key1 = KeyPair.fromXdrPublicKey(EdDSAPublicKey.fromXdr(new byte[]{1, 2, 3}));
        KeyPair key2 = KeyPair.fromBip39Seed(bip39Seed, accountNumber);
        Preconditions.checkState(key1 == key2);
    }

}