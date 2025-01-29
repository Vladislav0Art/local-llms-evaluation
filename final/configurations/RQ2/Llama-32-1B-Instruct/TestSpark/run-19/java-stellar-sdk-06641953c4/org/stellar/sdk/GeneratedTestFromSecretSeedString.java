package org.stellar.sdk;

public class GeneratedTestFromSecretSeedString {

    @Test
    public void testFromSecretSeedString() throws GeneralSecurityException {
        String seed = "your_secret_seed_here".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        Preconditions.checkNotNull(keyPair, "key pair is null");

        assertEquals(seed.length, keyPair.getSecretSeed().length, "secret seed length");
    }

}