package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedTest {

    private static final String SECRET_SEED = "SCZANGBA5YHTNYVVV4C3U252E2B6P6F5T3U6MM63WBSBZATAQI3EBTQ4";
    private static final String ACCOUNT_ID = "GAYOLLLUIZE4DZMBB2ZBKGBPGIMYN6E6O74IQZJCDL7E6RSGIUNAC6Y4";

    @Test
    public void canSignTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed(SECRET_SEED);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedCharArrayTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed(SECRET_SEED.toCharArray());
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedStringTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed(SECRET_SEED);
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void fromPublicKeyTest() {
        KeyPair keyPair = KeyPair.fromPublicKey(KeyPair.fromAccountId(ACCOUNT_ID).getPublicKey());
        assertNotNull(keyPair);
        assertEquals(keyPair.getAccountId(), ACCOUNT_ID);
    }

    @Test
    public void getAccountIdTest() {
        KeyPair keyPair = KeyPair.fromAccountId(ACCOUNT_ID);
        assertEquals(keyPair.getAccountId(), ACCOUNT_ID);
    }

    @Test
    public void getSecretSeedTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed(SECRET_SEED);
        assertArrayEquals(keyPair.getSecretSeed(), SECRET_SEED.toCharArray());
    }

    @Test
    public void verifyTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed(SECRET_SEED);
        String data = "Test data";
        byte[] signature = keyPair.sign(data.getBytes());
        assertTrue(keyPair.verify(data.getBytes(), signature));
    }

    @Test
    public void signFailTest() {
        // Construct KeyPair with null private key.
        KeyPair keyPair = KeyPair.fromAccountId(ACCOUNT_ID);
        keyPair.sign("Test data".getBytes());
    }

    @Test
    public void fromBadPublicKeyTest() {
        KeyPair.fromPublicKey(new byte[1]);
    }

}