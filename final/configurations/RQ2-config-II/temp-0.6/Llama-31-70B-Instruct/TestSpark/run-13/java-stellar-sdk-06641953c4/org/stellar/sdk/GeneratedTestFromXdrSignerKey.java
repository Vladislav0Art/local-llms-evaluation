package org.stellar.sdk;

public class GeneratedTestFromXdrSignerKey {

    @Test
    public void testFromXdrSignerKey() {
        KeyPair keyPair = KeyPair.random();

        SignerKey xdrSignerKey = keyPair.getXdrSignerKey();

        assertNotNull(xdrSignerKey);
        assertNotNull(KeyPair.fromXdrSignerKey(xdrSignerKey));
    }

}