package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.GeneralSecurityException;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeedCharArrayTest {

    @Test
    public void fromSecretSeedCharArrayTest() {
        char[] seed = "SAZWMVSQCJTLSZSWCNDZUUGKFRPEHJZFDQLYIWYZACBLNTXXJ5MI7XIFA".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}