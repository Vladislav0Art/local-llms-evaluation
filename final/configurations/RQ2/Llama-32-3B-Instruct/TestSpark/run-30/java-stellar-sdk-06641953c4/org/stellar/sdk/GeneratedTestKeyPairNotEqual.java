package org.stellar.sdk;

public class GeneratedTestKeyPairNotEqual {

    @Test
    public void testKeyPairNotEqual() {
        KeyPair keyPair1 = new KeyPair();
        KeyPair keyPair2 = new KeyPair();
        assertFalse(keyPair1.equals(keyPair2));
    }
}

public class KeyPair {

    private PublicKey publicKey;
    private PrivateKey privateKey;

    public KeyPair() {
    }

    public PublicKey getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(PublicKey publicKey) {
        this.publicKey = publicKey;
    }

    public PrivateKey getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(PrivateKey privateKey) {
        this.privateKey = privateKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeyPair keyPair = (KeyPair) o;
        return publicKey.equals(keyPair.publicKey);
    }

    @Override
    public int hashCode() {
        return publicKey.hashCode();
    }
}

public class PublicKey {

    private byte[] bytes;

    public PublicKey(byte[] bytes) {
        this.bytes = bytes;
    }

    public static PublicKey fromBase64(String base64String) {
        // implementation
        return null; // implement me!
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PublicKey publicKey = (PublicKey) o;
        return bytes.equals(publicKey.bytes);
    }
}

public class PrivateKey {

    private byte[] bytes;

    public PrivateKey(byte[] bytes) {
        this.bytes = bytes;
    }

    public static PrivateKey fromBase64(String base64String) {
        // implementation
        return null; // implement me!
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrivateKey privateKey = (PrivateKey) o;
        return bytes.equals(privateKey.bytes);
    }

}