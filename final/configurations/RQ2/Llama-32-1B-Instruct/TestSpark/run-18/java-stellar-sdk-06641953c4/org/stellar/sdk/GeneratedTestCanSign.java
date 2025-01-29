package org.stellar.sdk;

import org.junit.Test;

public class GeneratedTestCanSign {

    @Test
    public void testCanSign() {
        String secretSeed = "your_secret_seed_here";
        EdDSAPublicKey publicKey = fromSecretSeed(secretSeed);
        assert canSign(publicKey) : "Key pair cannot be signed with provided seed";
    }

}