package org.stellar.sdk;

public class GeneratedTestFromXdrSignerKey {

    @Test
    public void testFromXdrSignerKey() {
        SignerKey signerKey = new SignerKey("signerKey");
        KeyPair keyPair = KeyPair.fromXdrSignerKey(signerKey);
        assertEquals(signerKey, keyPair.getXdrSignerKey());
    }

}