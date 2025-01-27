package org.stellar.sdk;

public class GeneratedCanSign_ReturnsTrue {

    private KeyPair keyPair;
    private EdDSAPublicKey publicKey;

    @Before
    public void setup() {
        this.publicKey = new EdDSAPublicKey();
        keyPair = new KeyPair(publicKey);
    }

    @Test
    public void canSign_ReturnsTrue() {
        assertTrue(keyPair.canSign());
    }

}