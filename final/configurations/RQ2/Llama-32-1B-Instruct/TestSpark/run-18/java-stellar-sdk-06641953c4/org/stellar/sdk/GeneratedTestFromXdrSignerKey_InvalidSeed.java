package org.stellar.sdk;

import org.junit.Test;

public class GeneratedTestFromXdrSignerKey_InvalidSeed {

    @Test
    public void testFromXdrSignerKey_InvalidSeed() {
        String secretSeed = "your_secret_seed_here";
        SignerKey signerKey = fromXdrSignerKey(secretSeed);
        assert !canSign(signerKey) : "Generated key pair can be signed with provided seed";
    }

}