package org.stellar.sdk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedFromAccountId_ValidAccountId_ReturnsKeyPair {

    @Test
    public void fromAccountId_ValidAccountId_ReturnsKeyPair() throws Exception {
        AccountId accountId = new AccountId("valid-account-id");
        KeyPair keyPair = Llama32_3B_Instruct_TestSpark.generateFromAccountid(accountId);
        assertNotNull(keyPair.getPublic());
    }

}