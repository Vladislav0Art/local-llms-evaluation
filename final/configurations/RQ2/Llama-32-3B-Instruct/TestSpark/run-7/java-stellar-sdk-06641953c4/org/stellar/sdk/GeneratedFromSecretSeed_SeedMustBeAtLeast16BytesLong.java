package org.stellar.sdk;

public class GeneratedFromSecretSeed_SeedMustBeAtLeast16BytesLong {

    private KeyPair keyPair;
    private EdDSAPublicKey publicKey;

    @Before
    public void setup() {
        this.publicKey = new EdDSAPublicKey();
        keyPair = new KeyPair(publicKey);
    }

    @Test
    public void fromSecretSeed_SeedMustBeAtLeast16BytesLong() {
        byte[] seed = new byte[12];
        keyPair = KeyPair.fromSecretSeed(seed);
        assertEquals(12, keyPair.getSecretSeed().length);
    }

}