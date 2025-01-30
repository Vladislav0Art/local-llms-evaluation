package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void fromSecretSeedCharArrayTest() {
        char[] secretSeed = {'S', 'C', '2', 'D', 'K', '5', 'E', '6', 'F', 'K'};
        KeyPair keyPair = KeyPair.fromSecretSeed(secretSeed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedStringTest() {
        String secretSeed = "SC2DK5E6FK";
        KeyPair keyPair = KeyPair.fromSecretSeed(secretSeed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromAccountIdTest() {
        String accountId = "GDHXCOAYI5JDSSKULTMU5ZQKZY2PBZVTOHZ66E53FJTH3AWG4VTHJYDK";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
    }

    @Test
    public void randomTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
    }

    @Test
    public void equalsTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.fromAccountId(keyPair1.getAccountId());
        assertTrue(keyPair1.equals(keyPair2));
    }

    @Test
    public void getApiKeyTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getPublicKey());
    }

    @Test
    public void getSecretSeedTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getSecretSeed());
    }

    @Test
    public void fromXdrPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        PublicKey publicKey = keyPair.getXdrPublicKey();
        assertNotNull(KeyPair.fromXdrPublicKey(publicKey));
    }

    @Test
    public void fromXdrSignerKeyTest() {
        KeyPair keyPair = KeyPair.random();
        SignerKey signerKey = keyPair.getXdrSignerKey();
        assertNotNull(KeyPair.fromXdrSignerKey(signerKey));
    }

}