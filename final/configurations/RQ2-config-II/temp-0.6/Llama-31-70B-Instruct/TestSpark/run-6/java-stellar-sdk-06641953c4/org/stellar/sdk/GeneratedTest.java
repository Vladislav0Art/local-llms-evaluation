package org.stellar.sdk;

public class GeneratedTest {

    @Test
    public void testCanSign() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        assertFalse(keyPair.canSign());
    }

    @Test
    public void testFromSecretSeed_charArray() {
        char[] seed = "Test Seed".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void testFromSecretSeed_String() {
        String seed = "Test Seed";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void testFromSecretSeed_byteArray() {
        byte[] seed = "Test Seed".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void testFromAccountId() {
        String accountId = "Test Account ID";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
    }

    @Test
    public void testFromPublicKey() {
        byte[] publicKey = "Test Public Key".getBytes();
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotNull(keyPair);
    }

    @Test
    public void testFromBip39Seed() {
        byte[] bip39Seed = "Test Bip39 Seed".getBytes();
        int accountNumber = 1;
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, accountNumber);
        assertNotNull(keyPair);
    }

    @Test
    public void testRandom() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
    }

}