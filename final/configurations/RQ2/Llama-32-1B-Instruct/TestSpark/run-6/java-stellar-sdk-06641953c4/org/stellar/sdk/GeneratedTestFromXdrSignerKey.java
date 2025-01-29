package org.stellar.sdk;

public class GeneratedTestFromXdrSignerKey {

    private static org.stellar.sdk.KeyPair keyPair;

    @Before
    public void setup() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey();
        keyPair = KeyPair.fromPublic(publicKey);
    }

    public static void testFromSecretSeed() throws IOException, GeneralSecurityException {
        char[] seed = "example_secret_seed".getBytes();
        KeyPair fromSecretSeed = KeyPair.fromSecretSeed(seed);
        assertEquals(keyPair, fromSecretSeed);
    }

    public static void testFromSecretSeedString() throws IOException, GeneralSecurityException {
        String seed = "example_secret_seed";
        KeyPair fromSecretSeed = KeyPair.fromSecretSeed(seed);
        assertEquals(keyPair, fromSecretSeed);
    }

    public static void testFromSecretSeedByteArray() throws IOException, GeneralSecurityException {
        byte[] seed = "example_secret_seed".getBytes();
        KeyPair fromSecretSeed = KeyPair.fromSecretSeed(seed);
        assertEquals(keyPair, fromSecretSeed);
    }

    public static void testFromAccountId() throws IOException, GeneralSecurityException {
        String accountId = "example_account_id";
        KeyPair fromAccountId = KeyPair.fromAccountId(accountId);
        assertEquals(keyPair, fromAccountId);
    }

    public static void testFromPublicKeyByteArray() throws IOException, GeneralSecurityException {
        byte[] publicKey = "example_public_key".getBytes();
        KeyPair fromPublicKey = KeyPair.fromPublicKey(publicKey);
        assertEquals(keyPair, fromPublicKey);
    }

    public static void testFromBip39Seed() throws IOException, GeneralSecurityException {
        String bip39Seed = "example_bip39_seed";
        byte[] seed = bip39Seed.getBytes();
        KeyPair fromBip39Seed = KeyPair.fromBip39Seed(seed);
        assertEquals(keyPair, fromBip39Seed);
    }

    public static void testRandom() throws IOException, GeneralSecurityException {
        keyPair = KeyPair.random();
    }

    @Test
    public void testFromXdrSignerKey() throws IOException, GeneralSecurityException {
        SignerKey signerKey = KeyPair.fromXdrSignerKey(new EdDSAPrivateKey().toXdr());
        assertEquals(keyPair, signerKey);
    }

    public static void testSign() throws IOException, GeneralSecurityException {
        byte[] data = "example_data".getBytes();
        org.stellar.sdk.Signature signature;
        try {
            signature = keyPair.sign(data);
            assertNotNull(signature);
            assertEquals("example_signature", signature.toString());
        } catch (SignatureException e) {
            fail(e.getMessage());
        }
    }

    public static void testSignDecorated() throws IOException, GeneralSecurityException {
        byte[] data = "example_data".getBytes();
        org.stellar.sdk.DecoratedSignature decoratedSignature;
        try {
            decoratedSignature = keyPair.signDecorated(data);
            assertNotNull(decoratedSignature);
            assertEquals("example_decorated_signature", decoratedSignature.toString());
        } catch (SignatureException e) {
            fail(e.getMessage());
        }
    }

    public static void testSignPayloadDecorated() throws IOException, GeneralSecurityException {
        byte[] data = "example_data".getBytes();
        org.stellar.sdk.DecoratedSignature decoratedSignature;
        try {
            decoratedSignature = keyPair.signPayloadDecorated(data);
            assertNotNull(decoratedSignature);
            assertEquals("example_decorated_signature", decoratedSignature.toString());
        } catch (SignatureException e) {
            fail(e.getMessage());
        }
    }

}