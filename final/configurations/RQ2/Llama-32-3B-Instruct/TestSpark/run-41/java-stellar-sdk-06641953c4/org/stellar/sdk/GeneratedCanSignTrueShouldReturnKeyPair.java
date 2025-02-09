package org.stellar.sdk;

public class GeneratedCanSignTrueShouldReturnKeyPair {

    private String secretSeed;
    private byte[] publicKey;
    private boolean canSign;

    public static KeyPair fromSecretSeed(char[] seed) {
        // implement method to create KeyPair object
        return new KeyPair();
    }

    public static KeyPair fromPublicBip39Seed(byte[] bip39Seed, int accountNumber) {
        // implement method to create KeyPair object
        return new KeyPair();
    }

    public String getSecretSeed() {
        return secretSeed;
    }

    public void setSecretSeed(String seed) {
        this.secretSeed = seed;
    }

    public byte[] getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(byte[] publicKey) {
        this.publicKey = publicKey;
    }

    public boolean canSign() {
        return canSign;
    }

    public void setCanSign(boolean canSign) {
        this.canSign = canSign;
    }
}

public class EdDSAPublicKey {

}

public class SignatureHint {

}

public class KeyPairTest {

    @Test
    public void canSignTrueShouldReturnKeyPair() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey();
        KeyPair keyPair = new KeyPair(publicKey);
        assertTrue(keyPair.canSign());
    }

}