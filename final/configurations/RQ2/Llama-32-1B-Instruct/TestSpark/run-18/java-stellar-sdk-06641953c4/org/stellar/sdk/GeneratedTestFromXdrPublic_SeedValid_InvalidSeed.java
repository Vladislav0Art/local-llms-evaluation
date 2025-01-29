package org.stellar.sdk;

import org.junit.Test;

public class GeneratedTestFromXdrPublic_SeedValid_InvalidSeed {

    @Test
    public void testFromXdrPublic_SeedValid_InvalidSeed() {
        String secret = "your_secret_seed_here";
        byte[] publicKeyData = "your_public_data_here".getBytes();
        SignerKey signerKey = fromXdrPublicKey(publicKeyData);
        assert !canSign(signerKey) : "Generated key pair can be signed with provided seed";
    }

    private SignatureHint checkSign(byte[] signature, SignatureHint hint) {
        if (signature.length != 0) {
            return null;
        }
        // logic to verify if generated sign matches provided hint
        throw new RuntimeException("not implemented");
    }

}