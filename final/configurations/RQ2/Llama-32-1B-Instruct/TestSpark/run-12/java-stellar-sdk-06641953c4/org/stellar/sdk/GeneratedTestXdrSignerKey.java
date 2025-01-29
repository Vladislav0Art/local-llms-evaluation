package org.stellar.sdk;

public class GeneratedTestXdrSignerKey {

    @Test
    public void testXdrSignerKey() {
        SignerKey signerKey = EdDSAEngine.getEdSignerKey("1234567890abcdef");
        KeyPair key = KeyPair.fromXdrSignerKey(signerKey);
        assertTrue(key.getXdrSignerKey().length == signerKey.length);
        assertEquals(signerKey, key.getXdrSignerKey());
    }

}