package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Signature;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedFromBip39SeedTest {

    @Test
    public void fromBip39SeedTest() {
        byte[] bip39Seed = "BIP39_SEED".getBytes();
        int accountNumber = 1;
        KeyPair result = KeyPair.fromBip39Seed(bip39Seed, accountNumber);
        assertNotNull(result);
    }

}