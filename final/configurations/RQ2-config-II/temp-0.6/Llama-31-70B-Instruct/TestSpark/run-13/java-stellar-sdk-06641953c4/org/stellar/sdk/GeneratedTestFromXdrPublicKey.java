package org.stellar.sdk;

public class GeneratedTestFromXdrPublicKey {

    @Test
    public void testFromXdrPublicKey() {
        KeyPair keyPair = KeyPair.random();

        PublicKey xdrPublicKey = keyPair.getXdrPublicKey();

        assertNotNull(xdrPublicKey);
        assertNotNull(KeyPair.fromXdrPublicKey(xdrPublicKey));
    }

}