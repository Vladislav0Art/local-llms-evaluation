package org.stellar.sdk;

import org.stellar.sdk.DecoratedSignature;
import org.stellar.sdk.SignatureHint;
import org.stellar.sdk.SignerKey;
import org.stellar.sdk.XdrPublicKey;
import org.stellar.sdk.XdrSignerKey;

import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void testCanSign() {
        KeyPair key = new KeyPair(EdDSAPublicKey.fromSeed("123456789012345678901234567890"));
        assertTrue(key.canSign());
    }

    @Test
    public void testFromSecretSeed() {
        char[] secretSeed = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        KeyPair key = KeyPair.fromSecretSeed(secretSeed);
        assertNotNull(key);
        assertEquals(secretSeed.length, key.getSecretSeed().length);
    }

    @Test
    public void testFromAccountId() {
        String accountId = "123456789012345678901234567890";
        KeyPair key = KeyPair.fromAccountId(accountId);
        assertNotNull(key);
    }

    @Test
    public void testFromPublicKey() {
        byte[] publicKey = KeyPair.fromPublicKey(new EdDSAPublicKey().serialize());
        KeyPair key = new KeyPair(publicKey);
        assertNotNull(key);
    }

    @Test
    public void testRandom() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            byte[] seed = new byte[16];
            random.nextBytes(seed);
            KeyPair key = KeyPair.fromSecretSeed(seed);
            assertNotNull(key);
            assertEquals(16, key.getSecretSeed().length);
        }
    }

    @Test
    public void testGetAccountId() {
        String accountId = "123456789012345678901234567890";
        KeyPair key = new KeyPair(KeyPair.fromAccountId(accountId));
        assertNotNull(key);
    }

    @Test
    public void testGetSecretSeed() {
        char[] secretSeed = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        KeyPair key = new KeyPair(EdDSAPublicKey.fromSeed(secretSeed).serialize());
        assertEquals(secretSeed, key.getSecretSeed());
    }

    @Test
    public void testPublicKey() {
        byte[] publicKey = KeyPair.fromPublicKey(new EdDSAPublicKey().serialize());
        assertNotNull(publicKey);
    }

    @Test
    public void testSignatureHint() {
        SignatureHint hint = new SignatureHint();
        KeyPair key = new KeyPair(EdDSAPublicKey.fromSeed("123456789012345678901234567890").serialize());
        assertTrue(key.getSignatureHint().equals(hint));
    }

    @Test
    public void testXdrPublicKey() {
        XdrPublicKey publicKey = KeyPair.fromXdrPublicKey(new EdDSAPublicKey().serialize());
        assertNotNull(publicKey);
    }

    @Test
    public void testXdrSignerKey() {
        SignerKey signerKey = new SignerKey();
        KeyPair key = new KeyPair(EdDSAPublicKey.fromSeed("123456789012345678901234567890").serialize(), signerKey);
        assertNotNull(key);
    }

    @Test
    public void testFromXdrPublicKey() {
        XdrPublicKey publicKey = new XdrPublicKey().toByteArray();
        KeyPair key = KeyPair.fromXdrPublicKey(publicKey);
        assertNotNull(key);
    }

    @Test
    public void testFromXdrSignerKey() {
        XdrSignerKey signerKey = new XdrSignerKey().toByteArray();
        KeyPair key = KeyPair.fromXdrSignerKey(signerKey);
        assertNotNull(key);
    }

    @Test
    public void testSign() {
        char[] data = "1234567890".toCharArray();
        String signature = SignatureHelper.generateSignature(EdDSAPublicKey.fromSeed("123456789012345678901234567890").serialize(), data, 1);
        KeyPair key = new KeyPair(EdDSAPublicKey.fromSeed("123456789012345678901234567890").serialize());
        assertTrue(key.sign(data).equals(signature));
    }

    @Test
    public void testSignDecorated() {
        String signature = SignatureHelper.generateSignature(EdDSAPublicKey.fromSeed("123456789012345678901234567890").serialize(), "Hello, World!", 1);
        KeyPair key = new KeyPair(EdDSAPublicKey.fromSeed("123456789012345678901234567890").serialize());
        assertTrue(key.signDecorated(signature).equals(signature));
    }

    @Test
    public void testVerify() {
        byte[] data = "Hello, World!".getBytes();
        String signature = SignatureHelper.generateSignature(EdDSAPublicKey.fromSeed("123456789012345678901234567890").serialize(), data, 1);
        KeyPair key = new KeyPair(EdDSAPublicKey.fromSeed("123456789012345678901234567890").serialize());
        assertTrue(key.verify(data, signature).equals(true));
    }

    @Test
    public void testGetHashCode() {
        char[] secretSeed = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String accountId = "123456789012345678901234567890";
        KeyPair key1 = new KeyPair(EdDSAPublicKey.fromSeed(secretSeed).serialize(), accountId);
        String accountId2 = "987654321098765432109876543210";
        KeyPair key2 = new KeyPair(EdDSAPublicKey.fromSeed(secretSeed).serialize(), accountId2);

        assertEquals(key1.hashCode(), key2.hashCode());
    }

}