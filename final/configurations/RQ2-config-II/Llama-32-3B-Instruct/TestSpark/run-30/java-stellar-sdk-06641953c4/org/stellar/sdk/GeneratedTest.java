package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.stellar.sdk.KeyPair;

public class GeneratedTest {

    @Test
    public void createNewKeyPairPublic() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey();
        KeyPair keyPair = new KeyPair(publicKey);
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void createNewKeyPairFromSecretSeedCharArray() {
        char[] seed = new char[32];
        Arrays.fill(seed, '0');
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void createNewKeyPairFromSecretSeedCharArrayReturnsSameAsCharArray() {
        char[] seed1 = new char[32];
        Arrays.fill(seed1, '0');
        KeyPair keyPair1 = KeyPair.fromSecretSeed(seed1);
        char[] seed2 = new char[32];
        Arrays.fill(seed2, '0');
        KeyPair keyPair2 = KeyPair.fromSecretSeed(seed2);
        assertEquals(Arrays.toString(seed1), Arrays.toString(keyPair2.getSecretSeed()));
    }

    @Test
    public void createNewKeyPairFromAccountId() {
        String accountId = "test_account_id";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void getAccountId() {
        String accountId = "test_account_id";
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        keyPair.setAccountId(accountId);
        assertEquals(accountId, keyPair.getAccountId());
    }

    @Test
    public void getSecretSeed() {
        char[] seed = new char[32];
        Arrays.fill(seed, '0');
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair.getSecretSeed());
        assertEquals(Arrays.toString(seed), Arrays.toString(keyPair.getSecretSeed()));
    }

    @Test
    public void getPublicKey() {
        byte[] publicKey = new byte[64];
        EdDSAPublicKey keyPublic = new EdDSAPublicKey();
        keyPublic.setBytes(publicKey);
        KeyPair keyPair = new KeyPair(keyPublic);
        assertNotNull(keyPair.getPublicKey());
        assertEquals(Arrays.toString(publicKey), Arrays.toString(keyPair.getPublicKey()));
    }

    @Test
    public void sign() {
        byte[] data = "test_data".getBytes();
        byte[] signature = new byte[64];
        KeyPair keyPair = KeyPair.fromSecretSeed(new char[]{'0'});
        assertTrue(keyPair.sign(data).length == 64);
        for (int i = 0; i < 64; i++) {
            assertEquals(signature[i], keyPair.sign(data)[i]);
        }
    }

    @Test
    public void verify() {
        byte[] data = "test_data".getBytes();
        byte[] signature = new byte[64];
        KeyPair keyPair = KeyPair.fromSecretSeed(new char[]{'0'});
        assertTrue(keyPair.verify(data, signature));
        assertFalse(keyPair.verify(data, Arrays.copyOf(signature, 63)));
    }

}