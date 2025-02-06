package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.stellar.sdk.KeyPair;

public class GeneratedTest {

    @Test
    public void newKeyPair_fromSecretSeedbyteArray_returnsNewKeyPair() {
        byte[] seed = "secret".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void newKeyPair_fromAccountId_string_returnsNewKeyPair() {
        String accountId = "test";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
    }

    @Test
    public void newKeyPair_fromBip39Seed_byteArray_accountNumber_returnsNewKeyPair() {
        byte[] bip39Seed = "secret".getBytes();
        int accountNumber = 1;
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, accountNumber);
        assertNotNull(keyPair);
    }

    @Test
    public void newKeyPair_random_returnsNewKeyPair() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
    }

    @Test
    public void getAccountId_returnsAccountId() {
        String accountId = "test";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertEquals(accountId, keyPair.getAccountId());
    }

    @Test
    public void getSecretSeed_returnsSecretSeed() {
        char[] secretSeed = "secret".toCharArray();
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromSecretKeySpec(secretSeed));
        assertNotNull(keyPair.getSecretSeed());
    }

    @Test
    public void getPublicKey_returnsPublicKey() {
        byte[] publicKey = "public".getBytes();
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotNull(keyPair.getPublicKey());
    }

    @Test
    public void sign_byteArray_returnsSignature() throws IOException, GeneralSecurityException {
        byte[] data = "data".getBytes();
        Signature signature = new Signature("signature");
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        XdrDataOutputStream os = new XdrDataOutputStream(bos);
        byte[] signatureHint = {1, 2, 3};
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromSecretKeySpec("secret".toCharArray()));
        DecoratedSignature result = keyPair.sign(data);
        assertEquals(signature.getDigest(), result.getEncoded());
    }

    @Test
    public void verify_byteArray_bytes_returnsBoolean() throws IOException, GeneralSecurityException {
        byte[] data = "data".getBytes();
        byte[] signature = "signature".getBytes();
        boolean result = KeyPair.fromSecretSeed("secret".toCharArray()).verify(data, signature);
        assertTrue(result);
    }

    @Test
    public void getSignatureHint_returnsSignatureHint() {
        SignatureHint hint = new SignatureHint(1, 2, 3);
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromSecretKeySpec("secret".toCharArray()));
        assertEquals(hint, keyPair.getSignatureHint());
    }

    @Test
    public void getXdrPublicKey_returnsXdrPublicKey() {
        PublicKey publicKey = PublicKey.fromXdrPublicKey("publicKey");
        KeyPair keyPair = KeyPair.fromXdrPublicKey(publicKey);
        assertNotNull(keyPair.getXdrPublicKey());
    }

    @Test
    public void getXdrSignerKey_returnsXdrSignerKey() {
        SignerKey signerKey = SignerKey.fromXdrSignerKey("signerKey");
        KeyPair keyPair = KeyPair.fromXdrSignerKey(signerKey);
        assertNotNull(keyPair.getXdrSignerKey());
    }

    @Test
    public void fromSecretSeed_string_returnsNewKeyPair() {
        String seed = "secret";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}