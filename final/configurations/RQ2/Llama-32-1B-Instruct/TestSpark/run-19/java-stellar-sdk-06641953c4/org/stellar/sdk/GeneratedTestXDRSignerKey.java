package org.stellar.sdk;

public class GeneratedTestXDRSignerKey {

    @Test
    public void testXDRSignerKey() {
        SignerKey signerKey = generateRandomXDRSignerKey();
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        Preconditions.checkNotNull(keyPair, "key pair is null");

        assertEquals(signerKey.length, keyPair.getXDRSignerKey().length, "xdr signer key length");
    }

}