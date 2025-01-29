package org.stellar.sdk;

import org.junit.Test;

public class GeneratedTestRandom_SeedValid_InvalidSeed {

    @Test
    public void testRandom_SeedValid_InvalidSeed() {
        EdDSAPublicKeySpec publicKeySpec = new EdDSAPublicKeySpec("your_secret_seed_here", 0);
        KeyPair keyPair = fromPublicSpec(publicKeySpec);
        assert checkSign(keyPair.sign("test_data"));
    }

}