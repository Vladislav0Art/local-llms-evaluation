package org.stellar.sdk;

public class GeneratedSignSingleCharacterSeedWorks {

    @Test
    public void signSingleCharacterSeedWorks() throws GeneralSecurityException, IOException {
        byte[] secretSeed = new byte[]{(byte) 'a'};
        KeyPair keyPair = KeyPair.fromSecretSeed(secretSeed);
        assertEquals(keyPair.getPublicKey(), keyPair.sign(new byte[0]));
    }

}