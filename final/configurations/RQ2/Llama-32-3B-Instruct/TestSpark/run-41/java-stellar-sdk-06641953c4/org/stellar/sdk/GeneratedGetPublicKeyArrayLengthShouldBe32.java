package org.stellar.sdk;

public class GeneratedGetPublicKeyArrayLengthShouldBe32 {

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
    public void getPublicKeyArrayLengthShouldBe32() {
        byte[] publicKey = {1, 2, 3};
        KeyPair keyPair = new KeyPair();
        keyPair.setPublicKey(KeyPair.fromPublicBip39Seed(publicKey, 42));
        assertEquals(32, ((byte[]) keyPair.getPublicKey()).length);
    }

}