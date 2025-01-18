package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.GeneralSecurityException;
import java.util.Random;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromSecretSeedByteArrayTest {

    @Test
    public void fromSecretSeedByteArrayTest() {
        KeyPair pair = KeyPair.random();
        char[] seed = pair.getSecretSeed();
        KeyPair restoredPair = KeyPair.fromSecretSeed(new String(seed).getBytes());
        assertEquals(pair.getAccountId(), restoredPair.getAccountId());
    }

}