package org.stellar.sdk;

import org.junit.Test;

public class GeneratedTestVerify_SeedValid_InvalidSeed {

    @Test
    public void testVerify_SeedValid_InvalidSeed() {
        String secretSeed = "your_secret_seed_here";
        EdDSAPublicKey publicKey = fromXdrPublicKey(new XdrData("your_public_data_here"));
        byte[] data = new byte[0];
        SignerKey signerKey = fromXdrSignerKey(secretSeed);
        boolean verified = keyPair.verify(publicKey, signerKey.getSigningKey(), data);
        assert !verified : "Generated verification failed with provided seed and keys";
    }

    private KeyPair fromSecretSeed(byte[] secret) {
        return new KeyPair(new EdDSAPublicKeySpec(secret));
    }

}