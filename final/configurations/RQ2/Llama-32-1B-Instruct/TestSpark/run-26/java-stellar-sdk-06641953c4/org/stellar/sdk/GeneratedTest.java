package org.stellar.sdk;

import com.google.common.baseObjects.ObjectOf;
import org.junit.Test;

import static org.junit.Assert.*;

import java.security.KeyPair;

public class GeneratedTest {

    @Test
    public void testCanSign() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        assertTrue(keyPair.canSign());
    }

    @Test
    public void testNoSignerSeed() throws GeneralSecurityException {
        KeyPair keyPair = new KeyPair(new byte[0]);
        assertFalse(keyPair.canSign());
    }

    @Test
    public void testRandomSeed() {
        KeyPair keyPair = KeyPair.random();
        assertEquals("random seed", new EdDSAPublicKey().getSecretSeed(), keyPair.getSecretSeed());
    }

    @Test
    public void testFromXdrPublicKey() {
        KeyPair keyPair = KeyPair.fromXdrPublicKey(new PublicKey());
        assertNotNull(keyPair);
        assertEquals(EdDSAPublicKey.class, keyPair.getClass());
    }

    @Test
    public void testFromXdrSignerKey() {
        KeyPair keyPair = KeyPair.fromXdrSignerKey(new SignerKey());
        assertNotNull(keyPair);
        assertEquals(SignerKey.class, keyPair.getClass());
    }

    @Test
    public void testFromSecretSeed() throws GeneralSecurityException {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey().generateSecretSeed());
        assertNotNull(keyPair);
        assertEquals(EdDSAPublicKey.class, keyPair.getClass());
        assertEquals("random seed", keyPair.getSecretSeed(), Objects.toString(keyPair.getSecretSeed()));
    }

    @Test
    public void testFromAccountId() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey().generateAccountId());
        assertNotNull(keyPair);
        assertEquals(EdDSAPublicKey.class, keyPair.getClass());
        assertEquals("random seed", keyPair.getAccountId(), Objects.toString(keyPair.getAccountId()));
    }

    @Test
    public void testFromBip39Seed() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey().generateBip39Seed("seed1"));
        assertNotNull(keyPair);
        assertEquals(EdDSAPublicKey.class, keyPair.getClass());
        assertEquals("random seed", keyPair.getSecretSeed(), Objects.toString(keyPair.getSecretSeed()));
    }

    @Test
    public void testGetAccountId() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey().generateBip39Seed("seed1"));
        assertEquals("random seed", keyPair.getAccountId(), Objects.toString(keyPair.getAccountId()));
    }

    @Test
    public void testGetSecretSeed() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        char[] secretSeed = keyPair.getSecretSeed();
        assertNotNull(secretSeed);
        assertEquals("random seed", Arrays.toString(secretSeed), "[]");
    }

    @Test
    public void testGetPublicKey() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey().generateBip39Seed("seed1"));
        PublicKey publicKey = keyPair.getPublicKey();
        assertNotNull(publicKey);
        assertEquals(EdDSAPublicKey.class, publicKey.getClass());
        assertEquals("random seed", Objects.toString(publicKey), "[]");
    }

    @Test
    public void testGetSignatureHint() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey().generateBip39Seed("seed1"));
        SignatureHint hint = keyPair.getSignatureHint();
        assertNotNull(hint);
        assertEquals(EdDSAPrivateKeySpec.class, hint.getClass());
    }

    @Test
    public void testGetXdrPublicKey() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey().generateBip39Seed("seed1"));
        PublicKey publicKey = keyPair.getXdrPublicKey();
        assertNotNull(publicKey);
        assertEquals(EdDSAPublicKey.class, publicKey.getClass());
    }

    @Test
    public void testGetXdrSignerKey() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey().generateBip39Seed("seed1"));
        SignerKey signerKey = keyPair.getXdrSignerKey();
        assertNotNull(signerKey);
        assertEquals(SignerKey.class, signerKey.getClass());
    }

    @Test
    public void testFromXdrPublicKey() {
        KeyPair keyPair = new KeyPair(new PublicKey());
        assertTrue(keyPair.canSign());

        // verify signature hint
        SignatureHint hint = Objects.toString(keyPair.getXdrSignerKey().getSignatureHint());
        assertEquals(EdDSAPrivateKeySpec.class, hint.getClass());

        // verify EdDSA private key
        EdDSAPrivateKeySpec spec = new EdDSAPrivateKeySpec("private seed", 0);
        KeyPair fromXdrPublicKeyFromSpec = KeyPair.fromXdrPrivKeyFromSpec(spec);
        assertTrue(fromXdrPublicKeyFromSpec.canSign());
    }

    @Test
    public void testFromXdrSignerKey() {
        KeyPair keyPair = new KeyPair(new SignerKey());
        assertTrue(keyPair.canSign());

        // verify signature hint
        SignatureHint hint = Objects.toString(keyPair.getXdrSignerKey().getSignatureHint());
        assertEquals(EdDSAPrivateKeySpec.class, hint.getClass());

        // verify EdDSA private key
        EdDSAPrivateKeySpec spec = new EdDSAPrivateKeySpec("private seed", 0);
        KeyPair fromXdrSignerKeyFromSpec = KeyPair.fromXdrPrivKeyFromSpec(spec);
        assertTrue(fromXdrSignerKeyFromSpec.canSign());
    }

    @Test
    public void testFromSecretSeed() {
        char[] secretSeed = new EdDSAPublicKey().generateSecretSeed();
        PublicKey publicKey = new EdDSAPublicKey().sign(secretSeed);

        // verify signature hint
        SignatureHint hint = Objects.toString(publicKey.getXdrPublicKey().getSignatureHint());
        assertEquals(EdDSAPrivateKeySpec.class, hint.getClass());

        // verify EdDSA private key
        EdDSAPrivateKeySpec spec = new EdDSAPrivateKeySpec("private seed", 0);
        KeyPair fromSecretSeedFromSpec = KeyPair.fromXdrPrivKeyFromSpec(spec);
        assertTrue(fromSecretSeedFromSpec.canSign());
    }

}