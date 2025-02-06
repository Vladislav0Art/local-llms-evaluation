package org.stellar.sdk;

public class GeneratedGetAccountId_emptyString {

    @Test
    public void getAccountId_emptyString() {
        char[] seed = "";
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        assertEquals("", keyPair.getAccountId());
    }

}