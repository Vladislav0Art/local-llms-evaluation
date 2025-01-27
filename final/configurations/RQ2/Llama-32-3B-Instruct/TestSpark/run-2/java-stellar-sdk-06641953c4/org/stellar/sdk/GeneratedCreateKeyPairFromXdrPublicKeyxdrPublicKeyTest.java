package org.stellar.sdk;

public class GeneratedCreateKeyPairFromXdrPublicKeyxdrPublicKeyTest {

    @Test
    public void createKeyPairFromXdrPublicKeyxdrPublicKeyTest() {
        PublicKey key = PublicKey.getInstance(" publicly_visible_key ");
        KeyPair keyPair = KeyPair.fromXdrPublicKey(key);
        assertNotNull(keyPair);
    }

}