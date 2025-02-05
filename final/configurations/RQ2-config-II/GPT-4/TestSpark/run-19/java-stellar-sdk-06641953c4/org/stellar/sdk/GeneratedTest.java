package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.KeyPairGenerator;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void fromSecretSeedArrayTest() {
        byte[] seed = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedArrayInvalidTest() {
        byte[] seed = new byte[]{1, 2, 3}; // invalid size
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
    }

    @Test
    public void fromSecretSeedStringTest() {
        String seed = "ABCDEFGHIJKLMNOP";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromAccountIdTest() {
        String accountId = "ABCDEFGHIJK";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
    }

    @Test
    public void fromAccountIdInvalidTest() {
        String accountId = "XYZ"; // invalid accountId
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
    }

    @Test
    public void fromPublicKeyTest() {
        byte[] publicKey = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotNull(keyPair);
    }

    @Test
    public void randomTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
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
    public void hashCodeTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.hashCode());
    }

    @Test
    public void equalsTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.random();
        assertFalse(keyPair1.equals(keyPair2));

        KeyPair keyPair3 = KeyPair.fromSecretSeed(keyPair1.getSecretSeed());
        assertTrue(keyPair1.equals(keyPair3));
    }

    @Test
    public void verifyTest() throws Exception {
        KeyPair keyPair = KeyPair.random();
        String data = "Test data to sign";
        byte[] signature = keyPair.sign(data.getBytes());
        assertTrue(keyPair.verify(data.getBytes(), signature));
    }

    @Test
    public void verifyInvalidSignatureTest() throws Exception {
        KeyPair keyPair = KeyPair.random();
        String data = "Test data to sign";
        byte[] signature = new byte[]{0, 1, 2, 3, 4, 5}; // Invalid signature
        assertFalse(keyPair.verify(data.getBytes(), signature));
    }

    @Test
    public void constructorTestPublicKeysOnly() throws GeneralSecurityException {
        EdDSAPublicKey edDSAPublicKey = new EdDSAPublicKey(new EdDSAPrivateKey().getSpec());
        KeyPair keyPair = new KeyPair(edDSAPublicKey);
        assertNotNull(keyPair);
        assertFalse(keyPair.canSign());
    }

}