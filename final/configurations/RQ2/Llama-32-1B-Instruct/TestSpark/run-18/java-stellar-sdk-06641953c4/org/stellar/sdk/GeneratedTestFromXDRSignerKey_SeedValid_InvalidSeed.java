package org.stellar.sdk;

public class GeneratedTestFromXDRSignerKey_SeedValid_InvalidSeed {

    @Test
    public void testFromXDRSignerKey_SeedValid_InvalidSeed() {
        String secretSeed = "your_secret_seed_here";
        SignerKey signerKey = fromXdrSignerKey(new SignerKey(new XdrDataOutputStream(new ByteArrayOutputStream())));
        assert signerKey.getXdrSignerKey().getSigningKey().equals(secretSeed) : "Key pair created with invalid seed";
    }

}