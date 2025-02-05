package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import net.i2p.crypto.eddsa.*;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void canSignNullPrivateKeyTest() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new EdDSAPublicKeySpec(new byte[32], EdDSANamedCurveTable.getByName(EdDSANamedCurveTable.CURVE_ED25519_SHA512)));
        KeyPair keyPair = new KeyPair(publicKey);
        assertFalse(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedCharArrayLengthTest() {
        try {
            KeyPair.fromSecretSeed(new char[1]);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException iae) {
            assertEquals("IllegalArgumentException: Secret seed must be 56 characters long.", iae.getMessage());
        }
    }

    @Test
    public void fromSecretSeedStringTest() {
        String seed = "SAMPLESECRETSEED>";

        try {
            KeyPair keyPair = KeyPair.fromSecretSeed(seed);
            assertNotNull(keyPair);
        } catch (Exception e) {
            fail("Exception should not have been thrown");
        }
    }

    @Test
    public void fromSecretSeedNullByteArrayTest() {
        KeyPair.fromSecretSeed((byte[]) null);
    }

    @Test
    public void fromPublicKeyInvalidBytesTest() {
        try {
            KeyPair.fromPublicKey(new byte[1]);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException iep) {
            assertEquals("Invalid publicKey bytes", iep.getMessage());
        }
    }

    @Test
    public void getAccountIdNotNullTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getAccountId());
    }

    @Test
    public void getSecretSeedInvalidPrivateKeyTest() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new EdDSAPublicKeySpec(new byte[32], EdDSANamedCurveTable.getByName(EdDSANamedCurveTable.CURVE_ED25519_SHA512)));
        KeyPair keyPair = new KeyPair(publicKey);
        keyPair.getSecretSeed();
    }

    @Test
    public void getSignatureHintNotNullTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getSignatureHint());
    }

    @Test
    public void fromXdrPublicKeyNotNullTest() {
        KeyPair keyPair = KeyPair.random();
        PublicKey publicKey = keyPair.getXdrPublicKey();
        KeyPair resultKeyPair = KeyPair.fromXdrPublicKey(publicKey);
        assertNotNull(resultKeyPair);
    }

    @Test
    public void verifyIncorrectSignatureTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = "test data".getBytes();
        byte[] signature = keyPair.sign(new byte[1]);
        assertFalse(keyPair.verify(data, signature));
    }

    @Test
    public void equalsNullObjectTest() {
        KeyPair keyPair = KeyPair.random();
        assertFalse(keyPair.equals(null));
    }

}