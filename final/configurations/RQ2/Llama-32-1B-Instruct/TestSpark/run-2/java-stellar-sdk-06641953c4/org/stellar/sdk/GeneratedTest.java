package org.stellar.sdk;

public class GeneratedTest {

    @Test
    public void testCanSign() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey("publicKey");
        assertTrue(KeyPair.canSign(publicKey));
    }

    @Test
    public void testCanVerifySignature() throws SignatureException, GeneralSecurityException {
        EdDSAEngine eddsaEngine = EdDSAEngine.getInstance("secp256k1");
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromSecretSeed("publicKey"));
        Signature signature = keyPair.signDecorator(decoratedSignature);
        assertTrue(KeyPair.verify(keyPair.getPublicKey(), signature));
    }

    @Test
    public void testGetAccountId() {
        String accountId = "accountId";
        EdDSAPublicKey publicKey = new EdDSAPublicKey(accountId.toCharArray());
        KeyPair keyPair = new KeyPair(publicKey);
        assertEquals(accountId, keyPair.getAccountId());
    }

    @Test
    public void testGetSecretSeed() {
        char[] secretSeed = "secretSeed";
        EdDSAPublicKey publicKey = new EdDSAPublicKey(secretSeed);
        KeyPair keyPair = new KeyPair(publicKey);
        assertTrue(Arrays.equals(keyPair.getSecretSeed(), secretSeed));
    }

    @Test
    public void testGetPublicKey() {
        byte[] publicKeyBytes = "publicKey";
        EdDSAPublicKey publicKey = new EdDSAPublicKey(publicKeyBytes);
        KeyPair keyPair = new KeyPair(publicKey);
        assertTrue(Arrays.equals(keyPair.getPublicKey(), publicKeyBytes));
    }

    @Test
    public void testGetSignatureHint() {
        SignatureHint hint = SignatureHint.NORMAL;
        EdDSAPublicKey publicKey = new EdDSAPublicKey("publicKey");
        KeyPair keyPair = new KeyPair(publicKey);
        assertTrue(KeyPair.getSignatureHint(keyPair) == hint);
    }

    @Test
    public void testGetXdrPublicKey() {
        PublicKey publicKey = new PublicKey("publicKey");
        KeyPair keyPair = new KeyPair(publicKey);
        assertEquals(publicKey, keyPair.getXdrPublicKey());
    }

    @Test
    public void testGetXdrSignerKey() {
        SignerKey signerKey = new SignerKey("signerKey");
        KeyPair keyPair = new KeyPair(signerKey);
        assertEquals(signerKey, keyPair.getXdrSignerKey());
    }

    @Test
    public void testFromXdrPublicKey() {
        PublicKey publicKey = new PublicKey("publicKey");
        KeyPair keyPair = KeyPair.fromXdrPublicKey(publicKey);
        assertEquals(publicKey, keyPair.getPublicKey());
    }

    @Test
    public void testFromXdrSignerKey() {
        SignerKey signerKey = new SignerKey("signerKey");
        KeyPair keyPair = KeyPair.fromXdrSignerKey(signerKey);
        assertEquals(signerKey, keyPair.getXdrSignerKey());
    }

    @Test
    public void testRandom() {
        KeyPair randomKeyPair = KeyPair.random();
        assertTrue(randomKeyPair.getPublicKey().equals(new EdDSAPublicKey("publicKey")));
        assertTrue(randomKeyPair.getSecretSeed().equals(new char[]{'s', 'e', 'c', 'r', 'e', 't'}));
    }

    @Test
    public void testGetAccountId() {
        String accountId = "accountId";
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromSecretSeed(accountId.toCharArray()));
        assertEquals(accountId, keyPair.getAccountId());
    }

}