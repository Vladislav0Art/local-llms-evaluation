package org.stellar.sdk;

public class GeneratedTestGetSecretSeed_xdr {

    @Test
    public void testGetSecretSeed_xdr() throws Exception {
        byte[] seed = new byte[]{1, 2, 3};
        String accountId = "account id".getBytes();
        KeyPair key = KeyPair.fromAccountId(accountId);
        Preconditions.checkState(key.getSecretSeed().length == seed.length);
    }

}