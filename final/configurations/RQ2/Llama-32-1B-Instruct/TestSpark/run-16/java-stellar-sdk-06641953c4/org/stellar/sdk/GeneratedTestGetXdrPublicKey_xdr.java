package org.stellar.sdk;

public class GeneratedTestGetXdrPublicKey_xdr {

    @Test
    public void testGetXdrPublicKey_xdr() throws Exception {
        byte[] publicKey = new byte[]{1, 2, 3};
        String accountId = "account id".getBytes();
        KeyPair key = KeyPair.fromAccountId(accountId);
        Preconditions.checkState(key.getXdrPublicKey().length == publicKey.length);
    }

}