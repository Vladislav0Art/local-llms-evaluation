package org.stellar.sdk;

public class GeneratedTestGetSignatureHint_xdr {

    @Test
    public void testGetSignatureHint_xdr() throws Exception {
        byte[] signatureHint = new byte[]{1, 2, 3};
        String accountId = "account id".getBytes();
        KeyPair key = KeyPair.fromAccountId(accountId);
        Preconditions.checkState(key.getSignatureHint().length == signatureHint.length);
    }

}