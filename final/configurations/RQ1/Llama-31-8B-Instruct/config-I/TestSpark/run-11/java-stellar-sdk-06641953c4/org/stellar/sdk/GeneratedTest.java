package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void canSignTest() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(new EdDSAPublicKeySpec(new byte[32], KeyPair.ed25519)), new EdDSAPrivateKey(new EdDSAPrivateKeySpec(new byte[32], KeyPair.ed25519)));
        assertTrue(keyPair.canSign());
    }

    @Test
    public void canSignTest_NoPrivateKey() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(new EdDSAPublicKeySpec(new byte[32], KeyPair.ed25519)), null);
        assertFalse(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedTest() {
        byte[] seed = new byte[32];
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedTest_NullSeed() {
        try {
            KeyPair.fromSecretSeed(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void fromAccountIdTest() {
        String accountId = "account-id";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
    }

    @Test
    public void fromAccountIdTest_NullAccountId() {
        try {
            KeyPair.fromAccountId(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void fromPublicKeyTest() {
        byte[] publicKey = new byte[32];
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotNull(keyPair);
    }

    @Test
    public void fromPublicKeyTest_InvalidPublicKey() {
        try {
            KeyPair.fromPublicKey(new byte[33]);
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // expected
        }
    }

}