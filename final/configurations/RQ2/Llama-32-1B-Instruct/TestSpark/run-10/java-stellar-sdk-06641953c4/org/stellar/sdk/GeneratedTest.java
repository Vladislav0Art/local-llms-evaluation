package org.stellar.sdk;

public class GeneratedTest {

    private static final String SECRET_SEED = "your_secret_seed_here";
    private static final char[] SECRET
    Seed =SECRET_SEED.getBytes();
    private static final byte[] BIP39Seed = "bip39_seed_here".getBytes();

    @Test
    public void testFromSecretSeed() {
        KeyPair keyPair = KeyPair.fromSecretSeed(SECRET Seed);
        Preconditions.checkNotNull(keyPair, "Expected KeyPair instance");
        assertEquals(SECRET Seed.length, keyPair.getSecretSeed().length, 1);
    }

    @Test
    public void testFromSecretSeed_Bip39Seed() {
        KeyPair keyPair = KeyPair.fromSecretSeed(BIP39Seed);
        Preconditions.checkNotNull(keyPair, "Expected KeyPair instance");
        assertEquals(SECRET Seed.length, keyPair.getSecretSeed().length, 1);
    }

    @Test
    public void testFromSecretSeed_SecretSeed() {
        KeyPair keyPair = KeyPair.fromSecretSeed(SECRET SEED);
        Preconditions.checkNotNull(keyPair, "Expected KeyPair instance");
        assertEquals(SECRET Seed.length, keyPair.getSecretSeed().length, 1);
    }

    @Test
    public void testFromBip39Seed_SecretSeed_BIP39Seed() {
        KeyPair keyPair = KeyPair.fromBip39Seed(BIP39Seed, 1); // account number
        Preconditions.checkNotNull(keyPair, "Expected KeyPair instance");
        assertEquals(SECRET Seed.length, keyPair.getSecretSeed().length, 1);
    }

    @Test
    public void testFromAccountId() {
        KeyPair keyPair = KeyPair.fromAccountId("your_account_id_here");
        Preconditions.checkNotNull(keyPair, "Expected KeyPair instance");
        // Note: This method is not well-defined in the spec
        assertEquals("your_secret_seed_here", keyPair.getSecretSeed());
    }

    @Test
    public void testFromPublicKey() {
        KeyPair keyPair = KeyPair.fromPublicKey(SECRET SEED);
        Preconditions.checkNotNull(keyPair, "Expected KeyPair instance");
        // Note: This method is not well-defined in the spec
        assertEquals(SECRET SEED.length, keyPair.getPublicKey().length, 1);
    }

    @Test
    public void testFromSecretSeed_SecretSeed() {
        KeyPair keyPair = KeyPair.fromSecretSeed(SECRET Seed);
        Preconditions.checkNotNull(keyPair, "Expected KeyPair instance");
        assertEquals(SECRET SEED.length, keyPair.getSecretSeed().length, 1);
    }

    @Test
    public void testRandomKey() {
        KeyPair keyPair = KeyPair.random();
        Preconditions.checkNotNull(keyPair, "Expected KeyPair instance");
    }

    @Test
    public void testGetAccountId_SecretSeed_BIP39Seed() {
        String accountId = KeyPair.fromSecretSeed(SECRET Seed).getAccountId();
        assertEquals("your_account_id_here", accountId);
    }

    @Test
    public void testXdrPublicKey() {
        PublicKey publicKey = KeyPair.fromPublicKey(SECRET SEED);
        Preconditions.checkNotNull(publicKey, "Expected KeyPair instance");
        assertEquals(SECRET SEED.length, publicKey.getXdrPublicKey().length, 1);
    }

    @Test
    public void testXdrSignerKey() {
        SignerKey signerKey = KeyPair.random().getXdrSignerKey();
        Preconditions.checkNotNull(signerKey, "Expected XDR signer key instance");
        assertEquals(SECRET SEED.length, signerKey.getXdrSignerKey().length, 1);
    }

    @Test
    public void testFromXdrPublicKey() {
        PublicKey publicKey = KeyPair.fromXdrPublicKey(new DecoratedSignature("your_signature_here", SECRET Seed));
        Preconditions.checkNotNull(publicKey, "Expected XDR Public Key instance");
        assertEquals(SECRET SEED.length, publicKey.getXdrPublicKey().length, 1);
    }

    @Test
    public void testFromXdrSignerKey() {
        SignerKey signerKey = KeyPair.fromXdrSignerKey(new Signature("your_signature_here", SECRET Seed));
        Preconditions.checkNotNull(signerKey, "Expected XDR Signer key instance");
        assertEquals(SECRET SEED.length, signerKey.getXdrSignerKey().length, 1);
    }

    @Test
    public void testSign() {
        String data = "your_data_here";
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromSecretSeed(SECRET Seed));
        byte[] signature = keyPair.sign(data.getBytes());
        Preconditions.checkNotNull(signature, "Expected byte array instance");
        assertEquals(SECRET SEED.length, signature.length, 1);
    }

    @Test
    public void testSignDecorated() {
        String data = "your_data_here";
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromSecretSeed(SECRET Seed));
        byte[] signerPayload = data.getBytes();
        DecoratedSignature signature = keyPair.sign(signerPayload);
        Preconditions.checkNotNull(signature, "Expected DecoratedSignature instance");
        assertEquals(SECRET SEED.length, signature.getSignHint().length(), 1);
    }

    @Test
    public void testVerify() {
        byte[] data = "your_data_here";
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromSecretSeed(SECRET Seed));
        byte[] signature = "your_signature_here".getBytes();
        boolean verified = keyPair.verify(data, signature);
        Preconditions.checkBoolean(verified, "Expected verification result to be true");
    }

    @Test
    public void testHashCode() {
        String data = "your_data_here";
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromSecretSeed(SECRET Seed));
        int hashCode = keyPair.hashCode();
        Preconditions.checkInt(hashCode, "Expected hash code to be correct");
    }

}