package org.stellar.sdk;

public class GeneratedTestToXdrSignerKey_SeedValid_InvalidSeed {

    @Test
    public void testToXdrSignerKey_SeedValid_InvalidSeed() {
        String secretSeed = "your_secret_seed_here";
        EdDSAPrivateKeySpec privateKeySpec = new EdDSAPrivateKeySpec(secretSeed, 0);
        KeyPair keyPair = fromSecretSeed(secretSeed);
        XdrDataOutputStream xdrOutStream = new ByteArrayOutputStream();
        try (XdrDataOutputStream xdrOutStream = new XdrDataOutputStream(xdrOutStream)) {
            privateKeySpec.xdr(privateKeySpecs);
            keyPair.getXdrSignerKey().xdr(xdrOutStream);
        }
        assert !xdrOutStream.toByteArray().equals(new byte[]{0, 1}); :"Key pair converted to invalid seed";
    }

}