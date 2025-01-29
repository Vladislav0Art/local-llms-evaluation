package org.stellar.sdk;

import org.junit.Test;

public class GeneratedTestSignDecoded_SeedValid {

    @Test
    public void testSignDecoded_SeedValid() {
        String secretSeed = "your_secret_seed_here";
        SignatureHint hint = SignatureHint.DECORATED;
        byte[] signature = keyPair.signDecorated(data());
        assert checkSign(signature, hint) : "Generated signature is not valid with provided seed and hint";
    }

}