package org.stellar.sdk;

public class GeneratedFromSecretSeedStringShouldThrowNullPointerException {

    @Test
    public void fromSecretSeedStringShouldThrowNullPointerException() {
        String seed = null;
        assertThrows(NullPointerException.class, () -> KeyPair.fromSecretSeed(seed));
    }

}