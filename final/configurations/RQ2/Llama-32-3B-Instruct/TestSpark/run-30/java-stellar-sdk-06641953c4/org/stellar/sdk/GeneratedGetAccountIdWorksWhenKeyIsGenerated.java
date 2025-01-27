package org.stellar.sdk;

public class GeneratedGetAccountIdWorksWhenKeyIsGenerated {

    @Test
    public void getAccountIdWorksWhenKeyIsGenerated() {
        KeyPair keyPair = KeyPair.random();
        assertEquals(keyPair.getAccountId(), keyPair.getXdrPublicKey().getAccountId());
    }

}