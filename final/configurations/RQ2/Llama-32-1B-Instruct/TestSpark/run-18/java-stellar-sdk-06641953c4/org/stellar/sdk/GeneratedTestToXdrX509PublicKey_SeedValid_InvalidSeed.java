package org.stellar.sdk;

public class GeneratedTestToXdrX509PublicKey_SeedValid_InvalidSeed {

    @Test
    public void testToXdrX509PublicKey_SeedValid_InvalidSeed() {
        String secretSeed = "your_secret_seed_here";
        EdDSAPublicKeySpec publicKeySpec = new EdDSAPublicKeySpec(secretSeed, 0);
        KeyPair keyPair = fromSecretSeed(secretSeed);
        XdrDataOutputStream xdrOutStream = new ByteArrayOutputStream();
        try (XdrDataOutputStream xdrOutStream = new XdrDataOutputStream(xdrOutStream)) {
            publicKeySpec.xdr(publicKeySpecs);
            keyPair.getXdrPublic.Key().xdr(xdrOutStream);
        }
        assert !xdrOutStream.toByteArray().equals(new byte[]{0, 1}); :"Key pair converted to invalid seed";
    }

}