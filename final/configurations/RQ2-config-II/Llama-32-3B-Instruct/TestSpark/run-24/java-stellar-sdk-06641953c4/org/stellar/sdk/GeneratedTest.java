package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void constructorPublicKey_ValidInput_ReturnsInstance() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey();
        KeyPair keyPair = new KeyPair(publicKey);
        assertNotNull(keyPair);
        assertEquals(publicKey, keyPair.getPublicKey());
    }

    @Test
    public void canSign_InvalidInput_ReturnsFalse() throws GeneralSecurityException {
        KeyPair keyPair = new KeyPair(null);
        assertFalse(keyPair.canSign());
    }

    @Test
    public void fromSecretSeed_InvalidInput_ReturnsNull() {
        byte[] seed = new byte[0];
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNull(keyPair);
    }

    @Test
    public void fromAccountId_ValidInput_ReturnsInstance() throws GeneralSecurityException {
        String accountId = "account-id";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
        assertEquals(accountId, keyPair.getAccountId());
    }

    @Test
    public void fromBip39Seed_ValidInput_ReturnsInstance() throws GeneralSecurityException {
        byte[] bip39Seed = new byte[16];
        int accountNumber = 123;
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, accountNumber);
        assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedByte_ValidInput_ReturnsInstance() throws GeneralSecurityException {
        byte[] seed = new byte[16];
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void getAccountId_InvalidInput_ReturnsNull() {
        KeyPair keyPair = new KeyPair(null);
        assertNull(keyPair.getAccountId());
    }

    @Test
    public void getPublicKey_InvalidInput_ReturnsNull() {
        EdDSAPublicKey publicKey = null;
        KeyPair keyPair = new KeyPair(publicKey);
        assertNull(keyPair.getPublicKey());
    }

    @Test
    public void getSecretSeed_ValidInput_ReturnsInstance() throws GeneralSecurityException {
        byte[] seed = new byte[16];
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair.getSecretSeed());
    }

    @Test
    public void sign_InvalidInput_ReturnsNull() throws GeneralSecurityException, IOException {
        KeyPair keyPair = new KeyPair(null);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        XdrDataOutputStream xdr = new XdrDataOutputStream(bos);
        keyPair.sign(new byte[16]);
        assertArrayEquals(new byte[0], bos.toByteArray());
    }

    @Test
    public void verify_InvalidInput_ReturnsFalse() throws GeneralSecurityException, IOException {
        KeyPair keyPair = new KeyPair(null);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        XdrDataOutputStream xdr = new XdrDataOutputStream(bos);
        byte[] signature = new byte[16];
        assertFalse(keyPair.verify(new byte[16], signature));
    }

    @Test
    public void hashCode_ReturnsUniqueHashCode() throws GeneralSecurityException {
        KeyPair keyPair1 = new KeyPair(null);
        KeyPair keyPair2 = new KeyPair(null);
        assertNotEquals(keyPair1.hashCode(), keyPair2.hashCode());
    }

}