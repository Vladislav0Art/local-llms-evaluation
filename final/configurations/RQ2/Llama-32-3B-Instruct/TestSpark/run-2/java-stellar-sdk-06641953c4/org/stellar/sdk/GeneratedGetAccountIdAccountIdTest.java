package org.stellar.sdk;

public class GeneratedGetAccountIdAccountIdTest {

    @Test
    public void getAccountIdAccountIdTest() {
        String accountId = "account_id";
        KeyPair keyPair = new KeyPair(accountId);
        assertEquals(accountId, keyPair.getAccountId());
    }

}