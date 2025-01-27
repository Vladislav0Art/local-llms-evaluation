package org.stellar.sdk;

public class GeneratedTest {

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

public class Test {

    @Test
    public void canSign_WorksWhenKeyIsGenerated() {
        KeyPair keyPair = KeyPair.random();
        assertTrue(keyPair.canSign());
    }

    @Test
    public void cannotSign_WorksWhenKeyIsNotGenerated() {
        assertNull(KeyPair.fromSecretSeed(new char[0]));
        assertTrue(KeyPair.fromSecretSeed(new byte[0]).canSign());
    }

    @Test
    public void fromSecretSeed_SingleCharacterSeedWorks() throws GeneralSecurityException {
        byte[] secretSeed = new byte[]{(byte) 'a'};
        KeyPair keyPair = KeyPair.fromSecretSeed(secretSeed);
        assertNotNull(keyPair.getPublicKey());
    }

    @Test
    public void fromSecretSeed_MultiCharacterSeedWorks() throws GeneralSecurityException {
        byte[] secretSeed = "abcd".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(secretSeed);
        assertNotNull(keyPair.getPublicKey());
    }

}