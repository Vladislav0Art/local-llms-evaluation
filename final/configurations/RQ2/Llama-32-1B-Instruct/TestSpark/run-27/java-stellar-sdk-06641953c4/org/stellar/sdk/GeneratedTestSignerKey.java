package org.stellar.sdk;

public class GeneratedTestSignerKey {

    @Test
    public void testSignerKey() throws IOException, GeneralSecurityException {
        KeyPair signerKey = new SignerKey();
        byte[] seed = "my_secret_seed".getBytes();
        KeyPair keyPair = KeyPair.fromXdrSignerKey(signerKey);
        assertNotNull(keyPair.getSecretSeed());
    }

}