package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromSecretSeedReturnsValidKeyPairWhenProvidedWithNonEmptyString {

    @Test
    public void fromSecretSeedReturnsValidKeyPairWhenProvidedWithNonEmptyString() {
        char[] seed = "1234567890".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}