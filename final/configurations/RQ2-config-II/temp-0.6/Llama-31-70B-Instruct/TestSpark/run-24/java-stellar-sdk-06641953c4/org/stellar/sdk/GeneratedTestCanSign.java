package org.stellar.sdk;

public class GeneratedTestCanSign {

    @Test
    public void testCanSign() {
        KeyPair keyPairWithPrivateKey = KeyPair.random();
        assertTrue(keyPairWithPrivateKey.canSign());

        KeyPair keyPairWithoutPrivateKey = new KeyPair(keyPairWithPrivateKey.getPublicKey());
        assertFalse(keyPairWithoutPrivateKey.canSign());
    }

}