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
    public void canSign_ReturnsFalse_WhenKeyPairIsNotGenerated() {
        KeyPair keyPair = null;
        assertFalse(keyPair.canSign());
    }

    @Test
    public void fromSecretSeed_ReturnsKeyPair_WhenSeedIsProvided() {
        char[] seed = new char[]{'a', 'b', 'c'};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeed_ThrowsNullPointerException_WhenSeedIsNotCharArray() {
        try {
            KeyPair.fromSecretSeed("abc");
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void fromAccountId_ThrowsNullPointerException_WhenAccountIdIsNull() {
        try {
            KeyPair.fromAccountId(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void fromAccountId_ReturnsKeyPair_WhenAccountIdIsProvided() {
        String accountId = "account-id";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeed_ThrowsNullPointerException_WhenSeedIsNull() {
        try {
            KeyPair.fromSecretSeed((char[]) null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void fromPublicKey_ThrowsNullPointerException_WhenPublicKeyIsNull() {
        try {
            KeyPair.fromPublicKey(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}