package org.stellar.sdk;

public class GeneratedTest {

    @Test
    public void createKeyPairFromPublicKeypublicKeyTest() {
        EdDSAPublicKey publicKey = EdDSAPublicKey.getInstance(EdDSANamedCurveTable.getByName("secp256k1"));
        KeyPair keyPair = new KeyPair(publicKey);
        assertNotNull(keyPair);
    }

    @Test
    public void createKeyPairFromPublicKeypublicKeyNoThrowTest() {
        EdDSAPublicKey publicKey = EdDSAPublicKey.getInstance(EdDSANamedCurveTable.getByName("secp256k1"));
        KeyPair keyPair = new KeyPair(publicKey);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void createKeyPairFromSecretSeedsecretSeedArrayTest() {
        char[] seed = "0123456789".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void createKeyPairFromSecretSeedsecretSeedStringTest() {
        String seed = "0123456789";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void createKeyPairFromBip39Seedbip39SeedArrayTest() {
        byte[] bip39Seed = "0123456789".getBytes();
        int accountNumber = 0;
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, accountNumber);
        assertNotNull(keyPair);
    }

    @Test
    public void createKeyPairFromXdrPublicKeyxdrPublicKeyTest() {
        PublicKey key = PublicKey.getInstance(" publicly_visible_key ");
        KeyPair keyPair = KeyPair.fromXdrPublicKey(key);
        assertNotNull(keyPair);
    }

    @Test
    public void getAccountIdAccountIdTest() {
        String accountId = "account_id";
        KeyPair keyPair = new KeyPair(accountId);
        assertEquals(accountId, keyPair.getAccountId());
    }

    @Test
    public void getSecretSeedsecretSeedArrayTest() {
        char[] seed = "0123456789".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair.getSecretSeed());
    }

    @Test
    public void getPublicKeypublicKeyTest() {
        byte[] publicKey = PublicKey.getInstance(" publicly_visible_key ").getEncoded();
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertEquals(publicKey, keyPair.getPublicKey());
    }

    @Test
    public void signBytesbytesTest() throws IOException, GeneralSecurityException {
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.getInstance(EdDSANamedCurveTable.getByName("secp256k1")));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        XdrDataOutputStream dos = new XdrDataOutputStream(bos);
        dos.writeUint32(12345);
        dos.writeUint64(67890);
        byte[] signature = keyPair.sign(bos.toByteArray());
        assertNotNull(signature);
    }

    @Test
    public void verifyBytesbytesSignatureTest() throws IOException, GeneralSecurityException {
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.getInstance(EdDSANamedCurveTable.getByName("secp256k1")));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        XdrDataOutputStream dos = new XdrDataOutputStream(bos);
        dos.writeUint32(12345);
        dos.writeUint64(67890);
        byte[] signature = keyPair.sign(bos.toByteArray());
        assertTrue(keyPair.verify(bos.toByteArray(), signature));
    }

}