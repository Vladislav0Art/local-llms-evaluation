package org.stellar.sdk;

public class GeneratedCanSignFalse {

    @Test
    public void canSignFalse() throws GeneralSecurityException {
        // Mock KeyPair to return false
        when(KeyPair.class).canSign().thenReturn(false);
        EdDSAPrivateKey privateKey = new EdDSAPrivateKey();
        KeyPair keyPair = new KeyPair(privateKey);
        assertFalse(keyPair.canSign());
    }

}