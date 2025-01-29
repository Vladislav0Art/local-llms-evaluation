package org.stellar.sdk;

public class GeneratedTestToXdrPublicKey_SeedValid_InvalidSeed {

    @Test
    public void testToXdrPublicKey_SeedValid_InvalidSeed() {
        String secretSeed = "your_secret_seed_here";
        EdDSAPublicKey publicKey = fromSecretSeed(secretSeed);
        XdrDataOutputStream xdrOutStream = new ByteArrayOutputStream();
        try (XdrDataOutputStream xdrOutStream = new XdrDataOutputStream(xdrOutStream)) {
            publicKey.xdr(publicKeys);
        }
        assert !xdrOutStream.toByteArray().equals(new byte[]{0, 1}); :"Key pair converted to invalid seed";
    }

}