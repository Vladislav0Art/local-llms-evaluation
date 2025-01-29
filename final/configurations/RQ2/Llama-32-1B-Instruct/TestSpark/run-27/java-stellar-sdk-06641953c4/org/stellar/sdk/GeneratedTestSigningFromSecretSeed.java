package org.stellar.sdk;

public class GeneratedTestSigningFromSecretSeed {

    @Test
    public void testSigningFromSecretSeed() {
        char[] secretSeed = "my_secret_seed".toCharArray();
        byte[] seed = "my_secret_seed".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(secretSeed);
        assertEquals(KeyPair.class, keyPair.getClass());
        assertNotEquals(null, keyPair.getSecretSeed());
    }

}