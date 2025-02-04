package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromBip39Seed_ReturnsKeyPair_WhenBip39SeedIsProvided {

    @Mock
    private EdDSAPublicKey publicKey;

    @Mock
    private EdDSAPrivateKey privateKey;

    @InjectMocks
    private KeyPair keyPair;

    @Test
    public void fromBip39Seed_ReturnsKeyPair_WhenBip39SeedIsProvided() {
        byte[] bip39Seed = new byte[32];
        int accountNumber = 1;
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, accountNumber);
        assertNotNull(keyPair);
    }

}