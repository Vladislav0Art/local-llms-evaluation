package org.stellar.sdk;

public class GeneratedFromSecretSeedSingleCharacterSeedWorks {

    @Test
    public void fromSecretSeedSingleCharacterSeedWorks() throws GeneralSecurityException {
        byte[] secretSeed = new byte[]{(byte) 'a'};
        KeyPair keyPair = KeyPair.fromSecretSeed(secretSeed);
        assertNotNull(keyPair.getPublicKey());
    }

}