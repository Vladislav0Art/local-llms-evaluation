package org.stellar.sdk;

public class GeneratedTestFromSecretSeedBytes {

    @Test
    public void testFromSecretSeedBytes() throws GeneralSecurityException {
        byte[] seed = "your_secret_seed_here".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        Preconditions.checkNotNull(keyPair, "key pair is null");

        assertEquals(seed.length, keyPair.getSecretSeed().length, "secret seed length");
    }

}