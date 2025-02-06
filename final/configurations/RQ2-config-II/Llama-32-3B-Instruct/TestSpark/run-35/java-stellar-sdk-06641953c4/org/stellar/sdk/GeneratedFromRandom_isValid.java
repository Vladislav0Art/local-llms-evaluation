package org.stellar.sdk;

public class GeneratedFromRandom_isValid {

    @Test
    public void fromRandom_isValid() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getPublicKey());
    }

}