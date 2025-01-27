package org.stellar.sdk;

public class GeneratedVerifySingleCharacterSeedWorks {

    @Test
    public void verifySingleCharacterSeedWorks() throws GeneralSecurityException, IOException {
        byte[] secretSeed = new byte[]{(byte) 'a'};
        byte[] signature = KeyPair.fromSecretSeed(secretSeed).sign(new byte[0]);
        assertTrue(KeyPair.fromSecretSeed(secretSeed).verify(new byte[0], signature));
    }

}