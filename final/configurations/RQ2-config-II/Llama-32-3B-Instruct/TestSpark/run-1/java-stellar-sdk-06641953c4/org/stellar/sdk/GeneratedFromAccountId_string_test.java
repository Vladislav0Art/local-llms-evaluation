package org.stellar.sdk;

public class GeneratedFromAccountId_string_test {

    @Test
    public void fromAccountId_string_test() {
        String accountId = "test";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
    }

}