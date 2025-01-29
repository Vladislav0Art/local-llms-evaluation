package org.stellar.sdk;

public class GeneratedTestCanSign {

    @Test
    public void testCanSign() throws GeneralSecurityException, MessageDigestException {
        EdDSAPublicKey publicKey = new EdDSAPublicKey();
        KeyPair keyPair = new KeyPair(publicKey);
        Preconditions.checkNotNull(keyPair, "key pair is null");

        assertTrue(keyPair.canSign(), "can sign");
    }

}