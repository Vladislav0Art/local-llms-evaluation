package org.stellar.sdk;

public class GeneratedGetPublicKeyTest {

    private KeyPair keyPair;

    @BeforeEach
    public void setUp() {
        keyPair = new KeyPair(/* TODO: mock or create real EdDSAPublicKey instance */);
    }

    @Test
    public void getPublicKeyTest() {
        byte[] publicKey = keyPair.getPublicKey();
        assertNotNull(publicKey);
    }

}