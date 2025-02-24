package org.stellar.sdk;

public class GeneratedCanSignTest {

    private KeyPair keyPair;

    @BeforeEach
    public void setUp() {
        keyPair = new KeyPair(/* TODO: mock or create real EdDSAPublicKey instance */);
    }

    @Test
    public void canSignTest() {
        boolean result = keyPair.canSign();
        assertTrue(result);
    }

}