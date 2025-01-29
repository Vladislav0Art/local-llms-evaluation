package org.stellar.sdk;

public class GeneratedTestFromXDRSignerKey {

    @Test
    public void testFromXDRSignerKey() {
        SignerKey signerKey = new EdDSAPrivateKeySpec();
        KeyPair keyPair = KeyPair.fromXDRSignerKey(signerKey);
        Preconditions.checkNotNull(keyPair, "key pair is null");

        assertEquals(signerKey.length, keyPair.getXDRSignerKey().length, "xdr signer key length");
    }

}