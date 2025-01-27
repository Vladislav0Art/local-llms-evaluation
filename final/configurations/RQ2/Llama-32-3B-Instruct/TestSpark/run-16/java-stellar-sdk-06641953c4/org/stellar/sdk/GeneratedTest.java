package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void constructor_givenEdDSAPublicKey_shouldCreateValidKeyPair() throws GeneralSecurityException {
        EdDSAPrivateKey private_key = new EdDSAPrivateKey();
        EdDSAPublicKey public_key = new EdDSAPublicKey();
        KeyPair key_pair = new KeyPair(public_key);
        assertNotNull(key_pair);
    }

    @Test
    public void canSign_givenEdDSAPublicKey_shouldReturnTrue() throws GeneralSecurityException {
        EdDSAPrivateKey private_key = new EdDSAPrivateKey();
        EdDSAPublicKey public_key = new EdDSAPublicKey();
        KeyPair key_pair = new KeyPair(public_key);
        assertTrue(key_pair.canSign());
    }

    @Test
    public void fromSecretSeed_givenString_seed_shouldCreateValidKeyPair() throws GeneralSecurityException {
        String seed = "random_seed";
        KeyPair key_pair = KeyPair.fromSecretSeed(seed);
        assertNotNull(key_pair);
    }

    @Test
    public void fromSecretSeed_givenByteArray_seed_shouldCreateValidKeyPair() throws GeneralSecurityException {
        byte[] seed = "random_seed".getBytes();
        KeyPair key_pair = KeyPair.fromSecretSeed(seed);
        assertNotNull(key_pair);
    }

    @Test
    public void fromAccountId_givenString_accountId_shouldReturnNull() {
        String accountId = "invalid_account_id";
        assertNull(KeyPair.fromAccountId(accountId));
    }

    @Test
    public void getPublicKey_givenEdDSAPublicKey_shouldReturnPublic-key-as-

    ByteArray() throws GeneralSecurityException {
        EdDSAPrivateKey private_key = new EdDSAPrivateKey();
        EdDSAPublicKey public_key = new EdDSAPublicKey();
        KeyPair key_pair = new KeyPair(public_key);
        byte[] expected_public_key = public_key.getEncoded();
        assertArrayEquals(expected_public_key, key_pair.getPublicKey());
    }

    @Test
    public void sign_givenByteArray_data_shouldReturnSignature-as-

    ByteArray() throws GeneralSecurityException {
        byte[] data = "random_data".getBytes();
        KeyPair key_pair = new KeyPair(new EdDSAPublicKey());
        byte[] signature = key_pair.sign(data);
        assertNotNull(signature);
    }

    @Test
    public void verify_givenByteArray_data_andByteArray_signature_shouldReturnTrue() throws GeneralSecurityException {
        byte[] data = "random_data".getBytes();
        KeyPair key_pair = new KeyPair(new EdDSAPublicKey());
        byte[] signature = new byte[64];
        Arrays.fill(signature, (byte) 0x00);
        assertTrue(key_pair.verify(data, signature));
    }

    @Test
    public void getAccountId_givenEdDSAPublicKey_shouldReturnNull() {
        EdDSAPrivateKey private_key = new EdDSAPrivateKey();
        EdDSAPublicKey public_key = new EdDSAPublicKey();
        KeyPair key_pair = new KeyPair(public_key);
        assertNull(key_pair.getAccountId());
    }

    @Test
    public void getSecretSeed_givenEdDSAPublicKey_shouldReturnNull() {
        EdDSAPrivateKey private_key = new EdDSAPrivateKey();
        EdDSAPublicKey public_key = new EdDSAPublicKey();
        KeyPair key_pair = new KeyPair(public_key);
        assertArrayEquals(0, key_pair.getSecretSeed());
    }

    @Test
    public void fromXdrPublicKey_givenPublicKey_shouldCreateValidKeyPair() throws GeneralSecurityException {
        PublicKey key = new PublicKey();
        KeyPair key_pair = KeyPair.fromXdrPublicKey(key);
        assertNotNull(key_pair);
    }

}