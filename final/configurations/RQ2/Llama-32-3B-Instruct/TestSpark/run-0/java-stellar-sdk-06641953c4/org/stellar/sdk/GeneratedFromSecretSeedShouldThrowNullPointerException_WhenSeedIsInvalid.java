package org.stellar.sdk;

public class GeneratedFromSecretSeedShouldThrowNullPointerException_WhenSeedIsInvalid {

    @Test
    public void fromSecretSeedShouldThrowNullPointerException_WhenSeedIsInvalid() {
        assertThrows(NullPointerException.class, () -> KeyPair.fromSecretSeed(null));
    }

}