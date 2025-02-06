package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void createKeyPairFromPublic() {
        EdDSAPublicKey publicKey = EdDSAEngine.generate();
        KeyPair keyPair = new KeyPair(publicKey);
        assertNotNull(keyPair);
    }

    @Test
    public void canSignValidSeedReturnsTrue() throws GeneralSecurityException, IOException {
        char[] seed = "valid_seed".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void cannotSignEmptySeedReturnsFalse() throws GeneralSecurityException, IOException {
        char[] seed = "";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertFalse(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedValidSeedWorks() throws GeneralSecurityException, IOException {
        char[] seed = "valid_seed".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair.getPublicKey());
    }

    @Test
    public void fromPublicKeyReturnsCorrectKeyPair() throws IOException {
        byte[] publicKey = EdDSAPublicKey.getEncoded();
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotNull(keyPair);
        assertEquals(EdDSAPublicKey.getEncoded(), keyPair.getPublicKey());
    }

    @Test
    public void fromAccountIdReturnsCorrectKeyPair() throws IOException {
        String accountId = "test_account_id";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
    }

    @Test
    public void randomWorks() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
    }

    @Test
    public void getAccountIdIsNonEmptyString() {
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.generate());
        assertNot null (keyPair.getAccountId());
        assertTrue(!keyPair.getAccountId().isEmpty());
    }

    @Test
    public void getSecretSeedIsNonEmptyCharArray() {
        char[] seed = "valid_seed".getBytes();
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.generate());
        assertNot null (keyPair.getSecretSeed());
        assertTrue(!keyPair.getSecretSeed().length == 0);
    }

    @Test
    public void getPublicKeyIsBytes() {
        byte[] publicKey = EdDSAPublicKey.getEncoded();
        KeyPair keyPair = new KeyPair(EdDSAEngine.generate());
        assertNot null (keyPair.getPublicKey());
        assertTrue((keyPair.getPublicKey()).length > 0);
    }

    @Test
    public void signNonEmptyDataReturnsCorrectSignature() throws GeneralSecurityException, IOException {
        byte[] data = "valid_data".getBytes();
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.generate());
        byte[] signature = keyPair.sign(data);
        assertNotNull(signature);
    }

    @Test
    public void signNullDataThrowsGeneralSecurityException() throws GeneralSecurityException, IOException {
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.generate());
        assertThrows(GeneralSecurityException.class, () -> keyPair.sign(null));
    }

}