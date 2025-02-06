package org.stellar.sdk;

public class GeneratedCanSign_isTrue {

    @Test
    public void canSign_isTrue() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        assertTrue(keyPair.canSign());
    }

}