package org.stellar.sdk;

public class GeneratedTestFromSecretSeed {

    @Test
    public void testFromSecretSeed() throws GeneralSecurityException {
        char[] seed = "your_secret_seed_here".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        Preconditions.checkNotNull(keyPair, "key pair is null");

        assertEquals(seed.length, keyPair.getSecretSeed().length, "secret seed length");
    }

}