package org.stellar.sdk;

public class GeneratedTestGetSecretSeed {

    @Test
    public void testGetSecretSeed() {
        String secretSeed = "1234567890";
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(new byte[]{1, 2, 3}));
        char[] expectedSecretSeed = Arrays.copyOf(secretSeed.toCharArray(), secretSeed.length);
        assertEquals(expectedSecretSeed, keyPair.getSecretSeed());
    }

}