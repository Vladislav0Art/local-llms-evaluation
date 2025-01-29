package org.stellar.sdk;

public class GeneratedTestGetSecretSeed {

    private static final String ACCOUNT_ID = "1";

    @Test
    public void testGetSecretSeed() {
        byte[] seed = "secret-seed-123456789".getBytes();
        KeyPair keyPair = new KeyPair(random().byteArray(32));
        assertEquals(seed, keyPair.getSecretSeed());
    }

}