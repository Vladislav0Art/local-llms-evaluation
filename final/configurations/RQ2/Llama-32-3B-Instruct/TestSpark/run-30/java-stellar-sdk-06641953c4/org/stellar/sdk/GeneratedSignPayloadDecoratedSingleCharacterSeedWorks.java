package org.stellar.sdk;

public class GeneratedSignPayloadDecoratedSingleCharacterSeedWorks {

    @Test
    public void signPayloadDecoratedSingleCharacterSeedWorks() throws GeneralSecurityException, IOException {
        byte[] secretSeed = new byte[]{(byte) 'a'};
        KeyPair keyPair = KeyPair.fromSecretSeed(secretSeed);
        assertEquals(keyPair.getPublicKey(), keyPair.signPayloadDecorated(new byte[0]));
    }

}