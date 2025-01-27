package org.stellar.sdk;

public class GeneratedHashCodeWorks {

    @Test
    public void hashCodeWorks() {
        KeyPair keyPair1 = new KeyPair(new EdDSAPublicKey());
        KeyPair keyPair2 = new KeyPair(new EdDSAPublicKey());
        assertNotEquals(keyPair1.hashCode(), keyPair2.hashCode());
    }
}

public class KeyPair {

    private PublicKey publicKey;

    public KeyPair(PublicKey publicKey) {
        this.publicKey = publicKey;
    }

    public boolean canSign() {
        // implementation
        return true; // for testing purposes
    }

    public static KeyPair fromSecretSeed(byte[] secretSeed) {
        // implementation
        return new KeyPair(publicKey); // for testing purposes
    }

    public PublicKey getXdrPublicKey() {
        return publicKey;
    }
}

public class EdDSAPublicKey implements PublicKey {

    @Override
    public byte[] getBytes() {
        // implementation
        return null; // for testing purposes
    }
}

public class PublicFactory {

    public static PublicKey fromBase64(String base64) {
        // implementation
        return null; // for testing purposes
    }

}