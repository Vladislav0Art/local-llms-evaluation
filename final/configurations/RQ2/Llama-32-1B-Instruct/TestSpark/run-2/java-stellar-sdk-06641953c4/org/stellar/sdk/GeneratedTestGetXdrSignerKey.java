package org.stellar.sdk;

public class GeneratedTestGetXdrSignerKey {

    @Test
    public void testGetXdrSignerKey() {
        SignerKey signerKey = new SignerKey("signerKey");
        KeyPair keyPair = new KeyPair(signerKey);
        assertEquals(signerKey, keyPair.getXdrSignerKey());
    }

}