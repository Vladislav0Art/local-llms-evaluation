package org.stellar.sdk;

import org.stellar.sdk.AccountKey;
import org.stellar.sdk.Bip39Seed;

public class GeneratedGenerateBip39Seed {

    @Test
    public void generateBip39Seed() {
        String seed = Bip39Seed.generateSeed("your_seed_here");
        Assert.assertEquals(seed, generateBip39Seed(seed));
    }
}

class AccountKeyGenerator {

    public static AccountKey generateAccountID() {
        return AccountKey.generate(1000);
    }

    public static Keypair getPrivateKey(String seed) {
        String privateSeed = KeyGeneratorTest.Bip39Seed.toSeedString(seed);
        Bip39Seed seed1 = new Bip39Seed(privateSeed);
        return new Keypair(Bip39Seed.toSeedString(seed1.getPrivateKey().getSeed()));
    }

    public static EdDSAPublicKey generateEdDSAPublicKey(byte[] seed) {
        String bip39Seed = KeyGeneratorTest.Bip39Seed.toBip39SeedString(seed);
        return new EdDSAPublicKey(KeyGeneratorTest.keypairFromSeed(bip39Seed));
    }
}

class Keypair {
    private static final String SEED = "your_seed_here";

    public static Keypair keypairFromSeed(String seed) {
        // implementation
    }

    public static boolean equals(Keypair other) {
        return true;
    }

    public static boolean hash(Keypair other) {
        return true;
    }
}

class EdDSAPublicKey {
    private static final String SEED = "your_seed_here";

    public static EdDSAPublicKey generate(String seed) {
        // implementation
    }

}