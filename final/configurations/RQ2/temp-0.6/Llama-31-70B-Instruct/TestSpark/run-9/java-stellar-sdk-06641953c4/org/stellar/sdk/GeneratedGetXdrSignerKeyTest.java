package org.stellar.sdk;

public class GeneratedGetXdrSignerKeyTest {

    private KeyPair keyPair;

    @BeforeEach
    public void setUp() {
        keyPair = new KeyPair(/* TODO: mock or create real EdDSAPublicKey instance */);
    }

    @Test
    public void getXdrSignerKeyTest() {
        SignerKey xdrSignerKey = keyPair.getXdrSignerKey();
        assertNotNull(xdrSignerKey);
    }

}