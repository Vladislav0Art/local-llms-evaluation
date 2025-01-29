package org.stellar.sdk;

public class GeneratedTestFromXdrSignerKey {

    @Test
    public void testFromXdrSignerKey() {
        SignerKey signerKey = null;
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new byte[]{1, 2, 3});
        KeyPair keyPair = KeyPair.fromXdrSignerKey(signerKey);
        assertEquals(publicKey, keyPair.getXdrPublicy());
    }

}