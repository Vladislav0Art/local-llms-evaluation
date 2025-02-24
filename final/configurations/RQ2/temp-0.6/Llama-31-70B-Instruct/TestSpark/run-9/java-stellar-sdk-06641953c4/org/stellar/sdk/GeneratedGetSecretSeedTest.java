package org.stellar.sdk;

public class GeneratedGetSecretSeedTest {

    private KeyPair keyPair;

    @BeforeEach
    public void setUp() {
        keyPair = new KeyPair(/* TODO: mock or create real EdDSAPublicKey instance */);
    }

    @Test
    public void getSecretSeedTest() {
        char[] secretSeed = keyPair.getSecretSeed();
        assertNotNull(secretSeed);
    }

}