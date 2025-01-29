package org.stellar.sdk;

public class GeneratedTestSigningFromXdrSignerKey {

    @Test
    public void testSigningFromXdrSignerKey() {
        SignerKey signerKey = new SignerKey();
        byte[] seed = "my_secret_seed".getBytes();
        KeyPair keyPair = KeyPair.fromXdrSignerKey(signerKey);
        assertEquals(KeyPair.class, keyPair.getClass());
        assertNotEquals(null, keyPair.getSecretSeed());
    }

}