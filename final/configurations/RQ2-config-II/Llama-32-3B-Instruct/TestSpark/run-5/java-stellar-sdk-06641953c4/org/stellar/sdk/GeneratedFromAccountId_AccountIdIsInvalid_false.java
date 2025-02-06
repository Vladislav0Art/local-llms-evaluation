package org.stellar.sdk;

public class GeneratedFromAccountId_AccountIdIsInvalid_false {

    @Test
    public void fromAccountId_AccountIdIsInvalid_false() throws Exception {
        String accountId = null;
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNull(keyPair.getAccountId());
    }

}