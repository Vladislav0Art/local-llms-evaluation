package org.stellar.sdk;

public class GeneratedTestSigningFromXdrPublicKey {

    @Test
    public void testSigningFromXdrPublicKey() {
        PublicKey publicKey = KeyPair.fromXdrPublicKey(new XdrDataOutputStream(new ByteArrayOutputStream()));
        KeyPair keyPair = new KeyPair(publicKey);
        assertEquals(publicKey, keyPair.getPublicKey());
        assertFalse(keyPair.canSign());
    }

}