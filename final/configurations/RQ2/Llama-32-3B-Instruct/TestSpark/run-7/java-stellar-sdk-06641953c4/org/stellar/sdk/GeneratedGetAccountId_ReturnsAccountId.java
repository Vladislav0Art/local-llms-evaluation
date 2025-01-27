package org.stellar.sdk;

public class GeneratedGetAccountId_ReturnsAccountId {

    private KeyPair keyPair;
    private EdDSAPublicKey publicKey;

    @Before
    public void setup() {
        this.publicKey = new EdDSAPublicKey();
        keyPair = new KeyPair(publicKey);
    }

    @Test
    public void getAccountId_ReturnsAccountId() {
        when(publicKey.getAccountId()).thenReturn("test");
        assertEquals("test", keyPair.getAccountId());
    }

}