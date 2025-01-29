package org.stellar.sdk;

public class GeneratedTestCanSign {

    public static KeyPair fromXdrPublicKey(PublicKey key) {
        return new EdDSAKeyPair(key);
    }

    public boolean canSign() {
        // placeholder implementation
        return true;
    }
}

public class KeyPairTest {

    @Test
    public void testCanSign() throws GeneralSecurityException, IOException {
        EdDSAKeyPairGenerator generator = new EdDSAKeyPairGenerator();
        KeyPair key = generator.fromXdrPublicKey(new PublicKey("..."));
        assertTrue(key.canSign());
    }

}