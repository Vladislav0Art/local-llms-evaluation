package org.stellar.sdk;

public class GeneratedTestXdrSignerKey_1_2 {

    @Test
    public void testXdrSignerKey_1_2() {
        KeyPair key = new KeyPair(new EdDSAPublicKey("xpub-key"));
        SignerKey signerKey = key.getXdrSignerKey();
        Preconditions.assertSame("signer-key", signerKey);
    }

}