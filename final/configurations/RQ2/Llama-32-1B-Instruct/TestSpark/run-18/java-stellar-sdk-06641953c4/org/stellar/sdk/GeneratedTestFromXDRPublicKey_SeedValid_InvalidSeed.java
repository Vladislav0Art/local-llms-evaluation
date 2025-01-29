package org.stellar.sdk;

public class GeneratedTestFromXDRPublicKey_SeedValid_InvalidSeed {

    @Test
    public void testFromXDRPublicKey_SeedValid_InvalidSeed() {
        String secretSeed = "your_secret_seed_here";
        PublicKey publicKey = fromXdrPublicKey(new PublicKey(new XdrDataOutputStream(new ByteArrayOutputStream())));
        assert publicKeys.getAccountId().equals("your_account_id_here") : "Key pair created with invalid seed";
    }

}