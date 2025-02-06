package org.stellar.sdk;

public class GeneratedFromSecretSeed_charArray_isValid {

    @Test
    public void fromSecretSeed_charArray_isValid() throws Exception {
        byte[] publicKey = new byte[]{1, 2, 3};
        KeyPair keyPair = KeyPair.fromSecretSeed(new char[]{'a', 'b', 'c'}, publicKey);
        assertNotNull(keyPair.getPublicKey());
    }

}