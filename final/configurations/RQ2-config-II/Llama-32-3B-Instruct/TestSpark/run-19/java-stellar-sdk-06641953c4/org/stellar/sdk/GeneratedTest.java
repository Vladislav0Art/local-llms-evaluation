package org.stellar.sdk;

import org.stellar.sdk.KeyPair;
import org.junit.Test;

import static org.junit.Assert.*;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void canSignWithValidKeyPair() {
        EdDSAPublicKey publicKey = EdDSAPrivateKey.generate().getPublicKey();
        KeyPair keyPair = new KeyPair(publicKey);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void cannotSignWithInvalidKeyPair() {
        EdDSAPublicKey publicKey = null;
        KeyPair keyPair = new KeyPair(publicKey);
        assertFalse(keyPair.canSign());
    }

    @Test
    public void fromSecretSeed_Bip39_WithSeedAndAccountNumber() throws GeneralSecurityException {
        byte[] bip39Seed = {1, 2, 3};
        int accountNumber = 0;
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, accountNumber);
        assertNotNull(keyPair.getPublicKey());
    }

    @Test
    public void fromSecretSeed_WithSeed() {
        char[] seed = {'a', 'b', 'c'};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair.getPublicKey());
    }

    @Test
    public void fromSecretSeed_WithEmptySeed() {
        byte[] seed = {};
        assertThrows(GeneralSecurityException.class, () -> KeyPair.fromSecretSeed(seed));
    }

    @Test
    public void fromAccountID_FullyQualifiedAccountId() {
        String accountId = "X-ACCOUNT-ID";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair.getPublicKey());
    }

    @Test
    public void fromAccountID_PartiallyQualifiedAccountId() {
        String accountId = "X-ACCOUNT";
        assertThrows(GeneralSecurityException.class, () -> KeyPair.fromAccountId(accountId));
    }

    @Test
    public void toXdrPublicKey() {
        EdDSAPublicKey publicKey = EdDSAPrivateKey.generate().getPublicKey();
        KeyPair keyPair = new KeyPair(publicKey);
        PublicKey xdrPublicKey = keyPair.getXdrPublicKey();
        assertNotNull(xdrPublicKey);
    }

    @Test
    public void fromXdrPublicKey_WithValidPublickey() {
        PublicKey key = new PublicKey(0x10, 0x20);
        KeyPair keyPair = KeyPair.fromXdrPublicKey(key);
        assertNotNull(keyPair.getPublicKey());
    }

    @Test
    public void fromXdrSignerKey_WithValidSignerKey() {
        SignerKey key = new SignerKey(0x30, 0x40);
        KeyPair keyPair = KeyPair.fromXdrSignerKey(key);
        assertNotNull(keyPair.getPublicKey());
    }

    @Test
    public void sign_BasicMessage() throws GeneralSecurityException {
        byte[] data = "Hello".getBytes();
        KeyPair keyPair = new KeyPair(EdDSAPrivateKey.generate().getPublicKey());
        byte[] signature = keyPair.sign(data);
        assertNotNull(signature);
    }

}