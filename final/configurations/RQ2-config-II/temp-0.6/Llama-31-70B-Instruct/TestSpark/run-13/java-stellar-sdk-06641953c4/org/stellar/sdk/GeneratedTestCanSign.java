package org.stellar.sdk;

public class GeneratedTestCanSign {

    @Test
    public void testCanSign() {
        KeyPair keyPair = KeyPair.random();

        assertTrue(keyPair.canSign());
        assertFalse(KeyPair.fromPublicKey(keyPair.getPublicKey()).canSign());
    }

}