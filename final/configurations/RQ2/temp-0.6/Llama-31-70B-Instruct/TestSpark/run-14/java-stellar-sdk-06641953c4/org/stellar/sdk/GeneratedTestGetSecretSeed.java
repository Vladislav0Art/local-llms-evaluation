package org.stellar.sdk;

public class GeneratedTestGetSecretSeed {

    private static KeyPair keyPair;

    @Before
    public void setUp() {
        keyPair = new KeyPair(new EdDSAPublicKey(), new EdDSAPrivateKey());
    }

    @Test
    public void testGetSecretSeed() {
        char[] secretSeed = keyPair.getSecretSeed();
        assertNotNull(secretSeed);
    }

}