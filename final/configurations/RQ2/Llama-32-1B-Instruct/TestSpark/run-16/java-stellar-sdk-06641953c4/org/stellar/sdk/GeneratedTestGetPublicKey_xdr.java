package org.stellar.sdk;

public class GeneratedTestGetPublicKey_xdr {

    @Test
    public void testGetPublicKey_xdr() throws Exception {
        byte[] publicKey = new byte[]{1, 2, 3};
        String accountId = "account id".getBytes();
        KeyPair key = KeyPair.fromAccountId(accountId);
        Preconditions.checkState(key.getPublicKey().length == publicKey.length);
    }

}