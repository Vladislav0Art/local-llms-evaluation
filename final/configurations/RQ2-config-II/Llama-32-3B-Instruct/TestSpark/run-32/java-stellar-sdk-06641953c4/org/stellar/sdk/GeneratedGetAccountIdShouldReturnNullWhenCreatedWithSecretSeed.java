package org.stellar.sdk;

public class GeneratedGetAccountIdShouldReturnNullWhenCreatedWithSecretSeed {

    @Test
    public void getAccountIdShouldReturnNullWhenCreatedWithSecretSeed() {
        char[] secretSeed = null;
        assertNull(keyPair.getAccountId());
    }

}