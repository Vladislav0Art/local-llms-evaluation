package org.stellar.sdk;

public class GeneratedTestXdrSignerKey {

    @Test
    public void testXdrSignerKey() {
        SignerKey signerKey = null;
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(new byte[]{1, 2, 3}));
        assertEquals(signerKey, keyPair.getXdrSignerKey());
    }

}