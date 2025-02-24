package org.stellar.sdk;

public class GeneratedFromXdrPublicKeyTest {

    private KeyPair keyPair;

    @BeforeEach
    public void setUp() {
        keyPair = new KeyPair(/* TODO: mock or create real EdDSAPublicKey instance */);
    }

    @Test
    public void fromXdrPublicKeyTest() {
        PublicKey xdrPublicKey = new PublicKey();
        // TODO: set up xdrPublicKey properties

        KeyPair keyPair = KeyPair.fromXdrPublicKey(xdrPublicKey);
        assertNotNull(keyPair);
    }

}