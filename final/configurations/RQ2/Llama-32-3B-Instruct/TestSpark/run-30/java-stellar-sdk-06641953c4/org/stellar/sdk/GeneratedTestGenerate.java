package org.stellar.sdk;

public class GeneratedTestGenerate {

    @Test
    public void testGenerate() {
        KeyPair keyPair = new KeyPair();
        assertNotNull(keyPair);
        assertNotEquals(null, keyPair.getPublicKey());
        assertNotEquals(0, keyPair.getPrivateKey().hashCode());
    }

}