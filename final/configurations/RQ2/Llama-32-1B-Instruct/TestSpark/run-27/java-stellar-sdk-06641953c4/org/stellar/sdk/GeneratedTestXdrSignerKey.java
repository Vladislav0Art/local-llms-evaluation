package org.stellar.sdk;

public class GeneratedTestXdrSignerKey {

    @Test
    public void testXdrSignerKey() throws IOException, GeneralSecurityException {
        SignerKey signerKey = new SignerKey();
        byte[] seed = "my_secret_seed".getBytes();
        KeyPair keyPair = KeyPair.fromXdrSignerKey(signerKey);
        assertNotNull(keyPair.getSecretSeed());
    }

}