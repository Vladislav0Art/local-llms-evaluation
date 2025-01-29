package org.stellar.sdk;

import org.junit.Test;

public class GeneratedTestSign_SeedValid_InvalidSeed {

    @Test
    public void testSign_SeedValid_InvalidSeed() {
        String secretSeed = "your_secret_seed_here";
        SignatureHint hint = SignatureHint.DECORATED;
        byte[] signature = keyPair.sign(data(), hint);
        assert !checkSign(signature, hint) : "Generated signature is valid with provided seed and hint";
    }

}