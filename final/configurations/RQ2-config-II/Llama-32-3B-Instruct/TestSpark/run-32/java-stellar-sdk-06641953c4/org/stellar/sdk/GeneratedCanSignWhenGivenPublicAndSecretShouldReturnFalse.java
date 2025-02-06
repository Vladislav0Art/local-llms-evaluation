package org.stellar.sdk;

public class GeneratedCanSignWhenGivenPublicAndSecretShouldReturnFalse {

    @Test
    public void canSignWhenGivenPublicAndSecretShouldReturnFalse() {
        EdDSAPublicKey publicKey = ...;
        char[] secretSeed = ...;
        boolean result = keyPair.canSign();
        assertFalse(result);
    }

}