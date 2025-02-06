package org.stellar.sdk;

public class GeneratedCanSign_PublicKeyIsNotSet_false {

    @Test
    public void canSign_PublicKeyIsNotSet_false() {
        KeyPair keyPair = new KeyPair(null);
        assertFalse(keyPair.canSign());
    }

}