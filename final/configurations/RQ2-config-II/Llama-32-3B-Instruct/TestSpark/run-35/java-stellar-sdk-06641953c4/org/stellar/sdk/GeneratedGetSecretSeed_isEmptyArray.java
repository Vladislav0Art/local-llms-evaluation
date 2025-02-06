package org.stellar.sdk;

public class GeneratedGetSecretSeed_isEmptyArray {

    @Test
    public void getSecretSeed_isEmptyArray() throws Exception {
        assertThrows(GeneralSecurityException.class, () -> KeyPair.fromSecretSeed(new byte[]{1, 2, 3}));
    }

}