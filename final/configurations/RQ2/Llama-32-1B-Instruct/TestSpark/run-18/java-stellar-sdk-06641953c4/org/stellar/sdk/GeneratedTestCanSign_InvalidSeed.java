package org.stellar.sdk;

import org.junit.Test;

public class GeneratedTestCanSign_InvalidSeed {

    @Test
    public void testCanSign_InvalidSeed() {
        String secretSeed = "your_secret_seed_here";
        EdDSAPublicKeySpec publicKeySpec = new EdDSAPublicKeySpec(secretSeed, 0);
        assert !canSign(publicKeySpec) : "Generated key pair can be signed with provided seed";
    }

}