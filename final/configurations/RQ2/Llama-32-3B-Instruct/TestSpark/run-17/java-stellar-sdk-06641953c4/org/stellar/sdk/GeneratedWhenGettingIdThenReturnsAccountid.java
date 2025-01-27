package org.stellar.sdk;

public class GeneratedWhenGettingIdThenReturnsAccountid {

    @Test
    public void whenGettingIdThenReturnsAccountid() {
        KeyPair keyPair = KeyPair.fromSecretSeed("account_id".getBytes());
        assertEquals("account_id", keyPair.getAccountId());
    }

}