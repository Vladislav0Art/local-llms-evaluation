package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.stellar.sdk.Keypair;
import org.stellar.sdk.XdrPublicKey;
import org.stellar.sdk.XdrSignerKey;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.stellar.sdk.KeyPair;
import org.stellar.sdk.EdDSAPublicKey;
import org.stellar.sdk.SignatureHint;
import org.stellar.sdk.SignerKey;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void canSign_ReturnsTrue_WhenKeyPairIsGenerated() {
        Keypair keyPair = new Keypair();
        assertTrue(keyPair.canSign());
    }

    @Test
    public void canSign_ReturnsFalse_WhenKeyPairIsNotGenerated() {
        Keypair keyPair = null;
        assertFalse(keyPair.canSign());
    }

    @Test
    public void fromSecretSeed_CharArray_ReturnsKeyPair() {
        char[] seed = new char[]{'a', 'b', 'c'};
        Keypair keyPair = Keypair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeed_String_ReturnsKeyPair() {
        String seed = "abc";
        Keypair keyPair = Keypair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeed_Byte_ReturnsKeyPair() {
        byte[] seed = new byte[]{1, 2, 3};
        Keypair keyPair = Keypair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromAccountId_String_ReturnsKeyPair() {
        String accountId = "account1";
        Keypair keyPair = Keypair.fromAccountId(accountId);
        assertNotNull(keyPair);
    }

    @Test
    public void fromPublicKey_Byte_ReturnsKeyPair() {
        byte[] publicKey = new byte[]{1, 2, 3};
        Keypair keyPair = Keypair.fromPublicKey(publicKey);
        assertNotNull(keyPair);
    }

    @Test
    public void fromBip39Seed_Byte_ReturnsKeyPair() {
        byte[] bip39Seed = new byte[]{1, 2, 3};
        int accountNumber = 1;
        Keypair keyPair = Keypair.fromBip39Seed(bip39Seed, accountNumber);
        assertNotNull(keyPair);
    }

}