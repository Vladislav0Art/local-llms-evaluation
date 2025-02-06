package org.stellar.sdk;

import org.stellar.sdk.KeyPair;
import org.junit.Test;

import static org.junit.Assert.*;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromSecretSeed_Bip39_WithSeedAndAccountNumber {

    @Test
    public void fromSecretSeed_Bip39_WithSeedAndAccountNumber() throws GeneralSecurityException {
        byte[] bip39Seed = {1, 2, 3};
        int accountNumber = 0;
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, accountNumber);
        assertNotNull(keyPair.getPublicKey());
    }

}