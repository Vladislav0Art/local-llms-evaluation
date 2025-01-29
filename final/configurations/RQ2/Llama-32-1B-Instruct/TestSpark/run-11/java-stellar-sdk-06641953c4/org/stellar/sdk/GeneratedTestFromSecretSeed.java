package org.stellar.sdk;

public class GeneratedTestFromSecretSeed {

    @Test
    public void testFromSecretSeed() throws GeneralSecurityException {
        String secretSeed = "123456789012345678901234567890";
        KeyPair keyPair = KeyPair.fromSecretSeed(secretSeed.toCharArray());
        assertEquals(secretSeed, keyPair.getSecretSeed());
    }

}