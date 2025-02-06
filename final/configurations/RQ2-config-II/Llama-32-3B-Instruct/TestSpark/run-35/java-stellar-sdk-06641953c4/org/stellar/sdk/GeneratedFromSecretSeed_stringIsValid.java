package org.stellar.sdk;

public class GeneratedFromSecretSeed_stringIsValid {

    @Test
    public void fromSecretSeed_stringIsValid() throws Exception {
        byte[] publicKey = new byte[]{1, 2, 3};
        KeyPair keyPair = KeyPair.fromSecretSeed("ab", publicKey);
        assertNotNull(keyPair.getPublicKey());
    }

}