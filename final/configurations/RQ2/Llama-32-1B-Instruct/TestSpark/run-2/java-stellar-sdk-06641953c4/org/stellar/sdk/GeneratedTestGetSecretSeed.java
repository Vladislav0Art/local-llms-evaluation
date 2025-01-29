package org.stellar.sdk;

public class GeneratedTestGetSecretSeed {

    @Test
    public void testGetSecretSeed() {
        char[] secretSeed = "secretSeed";
        EdDSAPublicKey publicKey = new EdDSAPublicKey(secretSeed);
        KeyPair keyPair = new KeyPair(publicKey);
        assertTrue(Arrays.equals(keyPair.getSecretSeed(), secretSeed));
    }

}