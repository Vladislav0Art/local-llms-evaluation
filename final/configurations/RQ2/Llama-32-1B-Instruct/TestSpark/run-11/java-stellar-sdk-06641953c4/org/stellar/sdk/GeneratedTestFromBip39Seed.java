package org.stellar.sdk;

public class GeneratedTestFromBip39Seed {

    @Test
    public void testFromBip39Seed() {
        String bip39Seed = "1234567890abcdef";
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new byte[]{1, 2, 3});
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed.getBytes(), 1);
        assertEquals(publicKey, keyPair.getPublicKey());
    }

}