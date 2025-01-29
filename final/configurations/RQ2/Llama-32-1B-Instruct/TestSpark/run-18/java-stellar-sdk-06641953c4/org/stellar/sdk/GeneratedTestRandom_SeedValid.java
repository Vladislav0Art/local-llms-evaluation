package org.stellar.sdk;

import org.junit.Test;

public class GeneratedTestRandom_SeedValid {

    @Test
    public void testRandom_SeedValid() {
        EdDSAPublicKeySpec publicKeySpec = new EdDSAPublicKeySpec("your_secret_seed_here", 0);
        KeyPair keyPair = fromPublic Spec(publicKeySpec);
        assert checkSign(keyPair.sign("test_data"));
    }

    private EdDSAPublicKeySpec fromPublicKeySpec(String seed, int specVersion) {
        return new EdDSAPublicKeySpec(seed, specVersion);
    }

}