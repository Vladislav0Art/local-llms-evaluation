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
public class GeneratedFromBip39Seed_Byte_ReturnsKeyPair {

    @Test
    public void fromBip39Seed_Byte_ReturnsKeyPair() {
        byte[] bip39Seed = new byte[]{1, 2, 3};
        int accountNumber = 1;
        Keypair keyPair = Keypair.fromBip39Seed(bip39Seed, accountNumber);
        assertNotNull(keyPair);
    }

}