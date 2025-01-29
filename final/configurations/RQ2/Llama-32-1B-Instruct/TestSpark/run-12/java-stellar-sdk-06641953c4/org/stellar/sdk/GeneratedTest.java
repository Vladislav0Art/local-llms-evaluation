package org.stellar.sdk;

public class GeneratedTest {

    @Test
    public void testCanSign() {
        KeyPair key = new KeyPair(EdDSAPublicKey.fromSeed("1234567890abcdef"));
        assertTrue(key.canSign());
    }

    @Test
    public void testRandomKey() {
        KeyPair key = KeyPair.random();
        assertEquals("1234567890abcdef", key.getSecretSeed());
    }

    @Test
    public void testGetAccountId() {
        String accountId = "1234567890abcdef";
        KeyPair key = new KeyPair(fromAccountId(accountId));
        assertEquals(accountId, key.getAccountId());
    }

    @Test
    public void testGetSecretSeed() {
        char[] secretSeed = {1, 2, 3};
        KeyPair key = new KeyPair(fromSecretSeed(secretSeed));
        assertTrue(key.getSecretSeed().length == secretSeed.length);
        Arrays.equals(secretSeed, key.getSecretSeed());
    }

    @Test
    public void testGetPublicKey() {
        byte[] publicKey = {1, 2, 3};
        KeyPair key = new KeyPair(fromPublicKey(publicKey));
        assertEquals(publicKey, key.getPublicKey());
    }

    @Test
    public void testSignatureHint() {
        KeyPair key = new KeyPair(EdDSAPublicKey.fromSeed("1234567890abcdef"));
        SignatureHint hint = key.getSignatureHint();
        assertNotNull(hint);
        assertEquals("SHA-256", hint.getAlgorithm());
    }

    @Test
    public void testXdrPublicKey() {
        PublicKey publicKey = EdDSAEngine.getEdPubKey("1234567890abcdef");
        KeyPair key = KeyPair.fromPublicKey(publicKey);
        assertTrue(key.getXdrPublicKey().length == publicKey.length);
        assertEquals(publicKey, key.getXdrPublicKey());
    }

    @Test
    public void testXdrSignerKey() {
        SignerKey signerKey = EdDSAEngine.getEdSignerKey("1234567890abcdef");
        KeyPair key = KeyPair.fromXdrSignerKey(signerKey);
        assertTrue(key.getXdrSignerKey().length == signerKey.length);
        assertEquals(signerKey, key.getXdrSignerKey());
    }

    @Test
    public void testFromSecretSeed() {
        char[] secretSeed = "1234567890abcdef";
        KeyPair key = KeyPair.fromSecretSeed(secretSeed);
        assertTrue(key.getSecretSeed().length == secretSeed.length);
        assertEquals(secretSeed, key.getSecretSeed());
    }

    @Test
    public void testFromBip39Seed() {
        String bip39Seed = "1234567890abcdef";
        KeyPair key = KeyPair.fromBip39Seed(bip39Seed, 1);
        assertTrue(key.getSecretSeed().length == bip39Seed.length);
        assertEquals(bip39Seed, key.getSecretSeed());
    }

    @Test
    public void testRandomKeyFromAccountId() {
        String accountId = "1234567890abcdef";
        KeyPair key = KeyPair.fromAccountId(accountId);
        assertTrue(key.getPublicKey().length == accountId.length);
        assertEquals(accountId, key.getPublicKey());
    }

}