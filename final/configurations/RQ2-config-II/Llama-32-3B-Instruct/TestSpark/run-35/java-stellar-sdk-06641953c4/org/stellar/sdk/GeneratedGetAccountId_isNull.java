package org.stellar.sdk;

public class GeneratedGetAccountId_isNull {

    @Test
    public void getAccountId_isNull() {
        assertNull(KeyPair.fromAccountId(null).getAccountId());
    }

}