package org.stellar.sdk;

public class GeneratedGetPublicKeyReturnsCompressedPublickKey {

    private KeyPair keyPair;
    private EdDSAPublicKey publicKey;

    @Before
    public void setup() {
        this.publicKey = new EdDSAPublicKey();
        keyPair = new KeyPair(publicKey);
    }

    @Test
    public void getPublicKeyReturnsCompressedPublickKey() {
        boolean compressed = true;
        when(publicKey.isCompressed()).thenReturn(compressed);
        byte[] publicKeyBytes = {1, 2, 3};
        when(publicKey.getBytes()).thenReturn(publicKeyBytes);
        assertTrue(keyPair.getPublicKey().isCompressed());
    }

}