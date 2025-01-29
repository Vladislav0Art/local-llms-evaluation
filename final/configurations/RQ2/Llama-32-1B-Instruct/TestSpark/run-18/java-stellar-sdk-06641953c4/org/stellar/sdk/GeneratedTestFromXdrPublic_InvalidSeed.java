package org.stellar.sdk;

import org.junit.Test;

public class GeneratedTestFromXdrPublic_InvalidSeed {

    @Test
    public void testFromXdrPublic_InvalidSeed() {
        String secret = "your_secret_seed_here";
        byte[] publicKeyData = "your_public_data_here".getBytes();
        SignerKey signerKey = fromXdrPublicKey(publicKeyData);
        assert !canSign(signerKey) : "Generated key pair can be signed with provided seed";
    }

}