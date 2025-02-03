package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.EdDSAPrivateKey;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

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

    @Test
    public void random_ReturnsKeyPair() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
    }

}