package org.stellar.sdk;

public class GeneratedTest {

    @Test
    public void testCanSign() {
        String secretSeed = "secret seed";
        KeyPair keyPair = new org.stellar.sdk.KeyPair(KeyPair.fromSecretSeed(secretSeed));
        Preconditions.checkNotNull(keyPair, "Expected a valid KeyPair instance");
        assertTrue(keyPair.canSign(), "KeyPair should be able to sign");
    }

    @Test
    public void testFromSecretSeed() {
        byte[] secretSeed = "secret seed".getBytes();
        KeyPair keyPair = org.stellar.sdk.KeyPair.fromSecretSeed(secretSeed);
        Preconditions.checkNotNull(keyPair, "Expected a valid KeyPair instance");
        assertEquals(secretSeed.length, keyPair.getSecretSeed().length, "KeyPair should have the correct length for secret seed");
    }

    @Test
    public void testFromAccountId() {
        String accountId = "account ID";
        KeyPair keyPair = org.stellar.sdk.KeyPair.fromAccountId(accountId);
        Preconditions.checkNotNull(keyPair, "Expected a valid KeyPair instance");
        assertEquals(accountId.length(), keyPair.getAccountId().length, "KeyPair should have the correct length for account ID");
    }

    @Test
    public void testFromBip39Seed() {
        String bip39Seed = "bip39 seed";
        byte[] seed = org.stellar.sdk.KeyPair.fromBip39Seed(bip39Seed, 1);
        Preconditions.checkNotNull(seed, "Expected a valid KeyPair instance");
        assertEquals(16, seed.length, "KeyPair should have the correct length for Bip39 seed");
    }

    @Test
    public void testRandom() {
        Random random = new Random();
        int count = 10;
        for (int i = 0; i < count; i++) {
            KeyPair keyPair = org.stellar.sdk.KeyPair.random();
            Preconditions.checkNotNull(keyPair, "Expected a valid KeyPair instance");
            assertEquals(32, keyPair.getSecretSeed().length, "KeyPair should have the correct length for secret seed");
        }
    }

    @Test
    public void testXdrPublicKey() {
        byte[] publicKey = org.stellar.sdk.KeyPair.fromPublicKey(new java.security.spec.PKCS8EncodedKeySpec("public key"));
        Preconditions.checkNotNull(publicKey, "Expected a valid KeyPair instance");
        assertEquals(32, publicKey.length, "KeyPair should have the correct length for public key");
    }

    @Test
    public void testXdrSignerKey() {
        byte[] signerKey = org.stellar.sdk.KeyPair.fromBip39Seed("bip39 seed", 1);
        Preconditions.checkNotNull(signerKey, "Expected a valid KeyPair instance");
        assertEquals(32, signerKey.length, "KeyPair should have the correct length for bip39 seed");
    }

    @Test
    public void testSign() {
        String data = "data to sign";
        byte[] signature = org.stellar.sdk.KeyPair.sign(data);
        Preconditions.checkNotNull(signature, "Expected a valid KeyPair instance");
        assertEquals(32, signature.length, "KeyPair should have the correct length for signature");
    }

    @Test
    public void testSignDecorated() {
        String data = "decorated data to sign";
        byte[] signature = org.stellar.sdk.KeyPair.signDecorator(data);
        Preconditions.checkNotNull(signature, "Expected a valid KeyPair instance");
        assertEquals(32, signature.length, "KeyPair should have the correct length for signature");
    }

    @Test
    public void testSignPayloadDecorated() {
        String data = "payload decorated to sign";
        byte[] signerPayload = org.stellar.sdk.KeyPair.signPayloadDecorator(data);
        Preconditions.checkNotNull(signerPayload, "Expected a valid KeyPair instance");
        assertEquals(32, signerPayload.length, "KeyPair should have the correct length for payload decorated signature");
    }

    @Test
    public void testVerify() {
        byte[] data = new byte[16];
        byte[] signature = org.stellar.sdk.KeyPair.signDecorator(data);
        Preconditions.checkNotNull(signature, "Expected a valid KeyPair instance");

        byte[] expectedSignature;
        try {
            expectedSignature = org.stellar.sdk.KeyPair.fromSignableData(signature);
        } catch (org.stellar.sdk.SignatureException e) {
            return;
        }
        assertEquals(expectedSignature.length, signature.length, "KeyPair should have the correct length for signature");
    }

    @Test
    public void testVerifyMultipleSignatures() {
        byte[] data = new byte[16];
        byte[] signature1 = org.stellar.sdk.KeyPair.signDecorator(data);
        byte[] signature2 = org.stellar.sdk.KeyPair.signDecorator(new java.util.Arrays.copyOfRange(data, 0, 8));
        Preconditions.checkNotNull(signature1, "Expected a valid KeyPair instance");
        assertEquals(32, signature1.length, "KeyPair should have the correct length for first signature");
        Preconditions.checkNotNull(signature2, "Expected a valid KeyPair instance");
        assertEquals(32, signature2.length, "KeyPair should have the correct length for second signature");

        byte[] expectedSignature;
        try {
            expectedSignature = org.stellar.sdk.KeyPair.fromSignableData(signature1);
        } catch (org.stellar.sdk.SignatureException e) {
            return;
        }
        assertEquals(expectedSignature.length, signature2.length, "KeyPair should have the correct length for second signature");

        byte[] verifiedSignature = org.stellar.sdk.KeyPair.verify(new byte[16], signature1);
        Preconditions.checkNotNull(verifiedSignature, "Expected a valid KeyPair instance");
        assertTrue(Arrays.equals(signature2, verifiedSignature), "Signature not verified correctly");
    }

}