package org.stellar.sdk;

public class GeneratedTest {

    @Test
    public void createKeyPairFromPublic_key() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey();
        KeyPair keyPair = new KeyPair(publicKey);
        assertNotNull(keyPair);
    }

    @Test
    public void canSignTrue() throws GeneralSecurityException {
        EdDSAPrivateKey privateKey = new EdDSAPrivateKey();
        KeyPair keyPair = new KeyPair(privateKey);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void canSignFalse() throws GeneralSecurityException {
        // Mock KeyPair to return false
        when(KeyPair.class).canSign().thenReturn(false);
        EdDSAPrivateKey privateKey = new EdDSAPrivateKey();
        KeyPair keyPair = new KeyPair(privateKey);
        assertFalse(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedByteArray_test() {
        char[] seed = "test".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedString_test() {
        String seed = "test";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromAccountId_string_test() {
        String accountId = "test";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
    }

    @Test
    public void getAccountId_emptyString() {
        char[] seed = "";
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        assertEquals("", keyPair.getAccountId());
    }

    @Test
    public void getSecretSeed_zeroLengthArray() {
        byte[] seed = new byte[0];
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        assertArrayEquals(seed, keyPair.getSecretSeed());
    }

    @Test
    public void signByteArray_test() throws GeneralSecurityException {
        byte[] data = "test".getBytes();
        KeyPair keyPair = new KeyPair(new EdDSAPrivateKey());
        byte[] signature = keyPair.sign(data);
        assertNotNull(signature);
    }

    @Test
    public void verifyByteArraySignature_true() throws GeneralSecurityException, SignatureException {
        byte[] data = "test".getBytes();
        byte[] signature = "test".getBytes();
        KeyPair keyPair = new KeyPair(new EdDSAPrivateKey());
        assertTrue(keyPair.verify(data, signature));
    }

    @Test
    public void verifyByteArraySignature_false() throws GeneralSecurityException, SignatureException {
        byte[] data = "test".getBytes();
        byte[] signature = new byte[0];
        KeyPair keyPair = new KeyPair(new EdDSAPrivateKey());
        assertFalse(keyPair.verify(data, signature));
    }

}