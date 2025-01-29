package org.stellar.sdk;

public class GeneratedTestFromSecretSeed_xdr {

    @Test
    public void testFromSecretSeed_xdr() throws Exception {
        byte[] seed = "secret seed".getBytes();
        String accountId = "account id".getBytes();
        KeyPair key1 = KeyPair.fromXdrPublicKey(EdDSAPublicKey.fromXdr(new byte[]{1, 2, 3}));
        KeyPair key2 = KeyPair.fromSecretSeed(seed);
        Preconditions.checkState(key1 == key2);
    }

}