package org.stellar.sdk;

import net.i2p.crypto.eddsa.*;
import org.junit.Test;
import org.stellar.sdk.xdr.SignerKey;

import java.security.MessageDigest;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void keyPairEmptyConstructorTest() {
        EdDSAPublicKey edDSAPublicKey = new EdDSAPublicKey(new EdDSAPublicKeySpec(new byte[32], EdDSANamedCurveTable.ED_25519_CURVE_SPEC));
        KeyPair keyPair = new KeyPair(edDSAPublicKey);
        assertNotNull(keyPair);
    }

    @Test
    public void keyPairFullConstructorTest() {
        EdDSAPublicKey edDSAPublicKey = new EdDSAPublicKey(new EdDSAPublicKeySpec(new byte[32], EdDSANamedCurveTable.ED_25519_CURVE_SPEC));
        EdDSAPrivateKey edDSAPrivateKey = new EdDSAPrivateKey(new EdDSAPrivateKeySpec(new byte[32], EdDSANamedCurveTable.ED_25519_CURVE_SPEC));
        KeyPair keyPair = new KeyPair(edDSAPublicKey, edDSAPrivateKey);
        assertNotNull(keyPair);
    }

    @Test
    public void canSignTest() {
        EdDSAPublicKey edDSAPublicKey = new EdDSAPublicKey(new EdDSAPublicKeySpec(new byte[32], EdDSANamedCurveTable.ED_25519_CURVE_SPEC));
        EdDSAPrivateKey edDSAPrivateKey = new EdDSAPrivateKey(new EdDSAPrivateKeySpec(new byte[32], EdDSANamedCurveTable.ED_25519_CURVE_SPEC));
        KeyPair keyPair = new KeyPair(edDSAPublicKey, edDSAPrivateKey);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedCharArrayTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed(new char[]{'s', 'e', 'e', 'd'});
        assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedStringTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed("seed");
        assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedByteArrayTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed(new byte[]{1, 0, 1, 0});
        assertNotNull(keyPair);
    }

    @Test
    public void fromAccountIdTest() {
        KeyPair keyPair = KeyPair.fromAccountId("accountid");
        assertNotNull(keyPair);
    }

    @Test
    public void fromPublicKeyTest() {
        KeyPair keyPair = KeyPair.fromPublicKey(new byte[]{1, 0, 1, 0});
        assertNotNull(keyPair);
    }

    @Test
    public void fromBip39SeedTest() {
        KeyPair keyPair = KeyPair.fromBip39Seed(new byte[]{1, 0, 1, 0}, 4);
        assertNotNull(keyPair);
    }

    @Test
    public void randomTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
    }

    @Test
    public void getAccountIdTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getAccountId());
    }

    @Test
    public void getSecretSeedTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getSecretSeed());
    }

    @Test
    public void getPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getPublicKey());
    }

    @Test
    public void getSignatureHintTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getSignatureHint());
    }

    @Test
    public void getXdrPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getXdrPublicKey());
    }

    @Test
    public void getXdrSignerKeyTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getXdrSignerKey());
    }

    @Test
    public void fromXdrPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(KeyPair.fromXdrPublicKey(keyPair.getXdrPublicKey()));
    }

    @Test
    public void fromXdrSignerKeyTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(KeyPair.fromXdrSignerKey(keyPair.getXdrSignerKey()));
    }

    @Test
    public void signTest() {
        EdDSAPublicKey edDSAPublicKey = new EdDSAPublicKey(new EdDSAPublicKeySpec(new byte[32], EdDSANamedCurveTable.ED_25519_CURVE_SPEC));
        KeyPair keyPair = new KeyPair(edDSAPublicKey);
        keyPair.sign(new byte[]{0, 1, 0, 1});
    }

    @Test
    public void verifyTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] signedData = keyPair.sign(new byte[]{0, 1, 0, 1});
        assertTrue(keyPair.verify(new byte[]{0, 1, 0, 1}, signedData));
    }

    @Test
    public void hashCodeTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.random();
        assertNotEquals(keyPair1.hashCode(), keyPair2.hashCode());
    }

    @Test
    public void equalsTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.random();
        assertFalse(keyPair1.equals(keyPair2));
        assertTrue(keyPair1.equals(keyPair1));
    }

}