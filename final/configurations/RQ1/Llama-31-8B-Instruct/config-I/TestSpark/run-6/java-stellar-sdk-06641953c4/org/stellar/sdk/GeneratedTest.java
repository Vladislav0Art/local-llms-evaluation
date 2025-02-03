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

    @Mock
    private EdDSAPublicKeySpec publicKeySpec;

    @Mock
    private EdDSAPrivateKeySpec privateKeySpec;

    @Mock
    private EdDSAPublicKey publicKey;

    @Mock
    private EdDSAPrivateKey privateKey;

    @InjectMocks
    private KeyPair keyPair;

    @Test
    public void canSign_ReturnsTrue_WhenPrivateKeyIsNotNull() {
        keyPair = new KeyPair(publicKey, privateKey);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void canSign_ReturnsFalse_WhenPrivateKeyIsNull() {
        keyPair = new KeyPair(publicKey, null);
        assertFalse(keyPair.canSign());
    }

    @Test
    public void fromSecretSeed_ReturnsKeyPair_WhenSeedIsProvided() {
        byte[] seed = new byte[32];
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeed_ReturnsKeyPair_WhenSeedIsProvidedAsCharArray() {
        String seed = "seed";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromAccountId_ReturnsKeyPair_WhenAccountIdIsProvided() {
        String accountId = "accountId";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
    }

    @Test
    public void fromPublicKey_ReturnsKeyPair_WhenPublicKeyIsProvided() {
        byte[] publicKey = new byte[32];
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotNull(keyPair);
    }

    @Test
    public void fromBip39Seed_ReturnsKeyPair_WhenBip39SeedIsProvided() {
        byte[] bip39Seed = new byte[32];
        int accountNumber = 1;
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, accountNumber);
        assertNotNull(keyPair);
    }

}