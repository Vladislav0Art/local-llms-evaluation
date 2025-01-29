package org.stellar.sdk;

public class GeneratedTestGetAccountId_1_2 {

    @Test
    public void testGetAccountId_1_2() {
        KeyPair key = new KeyPair(new EdDSAPublicKey("xpub-key"));
        String accountId = key.getAccountId();
        Preconditions.assertEquals("account-id-1-2", accountId);
    }

}