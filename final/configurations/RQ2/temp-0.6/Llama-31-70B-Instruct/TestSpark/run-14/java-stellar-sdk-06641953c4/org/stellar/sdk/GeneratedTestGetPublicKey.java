package org.stellar.sdk;

public class GeneratedTestGetPublicKey {

    private static KeyPair keyPair;

    @Before
    public void setUp() {
        keyPair = new KeyPair(new EdDSAPublicKey(), new EdDSAPrivateKey());
    }

    @Test
    public void testGetPublicKey() {
        byte[] publicKey = keyPair.getPublicKey();
        assertNotNull(publicKey);
    }

}