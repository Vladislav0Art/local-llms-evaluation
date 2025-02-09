package org.stellar.sdk;

import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void canSignTest() {
        KeyPair keyPair = KeyPair.random();
        assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedCharArrayTest() {
        char[] seed = {'s', 'e', 'e', 'd'};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotEquals(null, keyPair);
    }

    @Test
    public void fromSecretSeedStringTest() {
        String seed = "seed";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotEquals(null, keyPair);
    }

    @Test
    public void fromSecretSeedBytesArrayTest() {
        byte[] seed = {1, 2, 3, 4, 5};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotEquals(null, keyPair);
    }

    @Test
    public void fromAccountIdTest() {
        String accountId = "adf";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotEquals(null, keyPair);
    }

    @Test
    public void fromPublicKeyTest() {
        byte[] publicKey = {1, 2, 3, 4, 5};
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotEquals(null, keyPair);
    }

    @Test
    public void fromBip39SeedTest() {
        byte[] bip39Seed = {1, 2, 3, 4, 5};
        int accountNumber = 1;
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, accountNumber);
        assertNotEquals(null, keyPair);
    }

    @Test
    public void randomTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotEquals(null, keyPair);
    }

    @Test
    public void getAccountIdTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotEquals(null, keyPair.getAccountId());
    }

    @Test
    public void fromXdrPublicKeyTest() {
        PublicKey publicKeyMock = Mockito.mock(PublicKey.class);
        KeyPair keyPair = KeyPair.fromXdrPublicKey(publicKeyMock);
        assertNotEquals(null, keyPair);
    }

    @Test
    public void fromXdrSignerKeyTest() {
        SignerKey signerKeyMock = Mockito.mock(SignerKey.class);
        KeyPair keyPair = KeyPair.fromXdrSignerKey(signerKeyMock);
        assertNotEquals(null, keyPair);
    }

    @Test
    public void getPublicTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotEquals(null, keyPair.getPublicKey());
    }

    @Test
    public void equalsTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.random();
        assertEquals(false, keyPair1.equals(keyPair2));
    }

    @Test
    public void hashCodeTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotEquals(0, keyPair.hashCode());
    }

    @Test
    public void verifyInvalidSignatureTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = {1, 2, 3, 4, 5};
        byte[] signature = {6, 7, 8, 9, 10};
        keyPair.verify(data, signature);
    }

    @Test
    public void signTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = {1, 2, 3, 4, 5};
        byte[] signature = keyPair.sign(data);
        assertNotEquals(null, signature);
    }

    @Test
    public void signDecoratedTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = {1, 2, 3, 4, 5};
        assertNotNull(keyPair.signDecorated(data));
    }

}