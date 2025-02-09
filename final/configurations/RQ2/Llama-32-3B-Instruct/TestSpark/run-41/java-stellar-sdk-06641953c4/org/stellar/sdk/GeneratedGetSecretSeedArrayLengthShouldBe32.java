package org.stellar.sdk;

public class GeneratedGetSecretSeedArrayLengthShouldBe32 {

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
    public void getSecretSeedArrayLengthShouldBe32() {
        char[] seed = "my_seed".toCharArray();
        KeyPair keyPair = new KeyPair();
        keyPair.setSecretSeed(KeyPair.fromSecretSeed(seed));
        assertEquals(32, ((String) keyPair.getSecretSeed()).length());
    }

}