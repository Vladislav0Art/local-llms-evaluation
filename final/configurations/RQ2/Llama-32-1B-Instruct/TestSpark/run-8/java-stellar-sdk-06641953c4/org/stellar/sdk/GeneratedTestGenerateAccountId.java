package org.stellar.sdk;

import com.google.common.base.Preconditions;
import org.junit.Assert;

public class GeneratedTestGenerateAccountId {

    public static String generateAccountId() {
        return "your_account_id_here";
    }

    public static String generateBip39Seed(String seed) {
        Preconditions.checkArgument(seed != null, "seed cannot be null");
        byte[] bytes = Base64.getEncoder().encode(seed);
        return new String(bytes);
    }

    public static String generateEdDSAPublicKey(byte[] secretSeed) {
        Preconditions.checkArgument(secretSeed != null, "secret_seed cannot be null");
        int length = secretSeed.length;
        if (length % 4 != 0) {
            throw new RuntimeException("Secret seed must have even length.");
        }
        byte[] secretSeedBytes = secretSeed;
        byte[] publicSeed = new byte[length / 4];
        System.arraycopy(secretSeedBytes, 0, publicSeed, 0, length);
        return Base64.getEncoder().encodeToString(publicSeed);
    }

    public static EdDSAPublicKey generateEdDSAPublicKey(String accountID) {
        String secretSeed = generateBip39Seed(accountID);
        return Keypair.fromPublicKey(secretSeed.getBytes());
    }
}

class KeyPair {

    private byte[] publicKey;
    private byte[] privateKey;

    public KeyPair(byte[] publicKey, byte[] privateKey) {
        this.publicKey = publicKey;
        this.privateKey = privateKey;
    }

    public String getPublicKey() {
        return Base64.getEncoder().encodeToString(publicKey);
    }

    public Keypair getPrivateKey() {
        return new Keypair(privateKey, generateEdDSAPublicKey(this.getPublicKey()));
    }
}

public class KeyGeneratorTest {

    @Test
    public void testGenerateAccountId() {
        String accountID = AccountKeyGenerator.generateAccountID();
        Assert.assertEquals("your_account_id_here", accountID);
    }

}