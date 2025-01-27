package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromSecretSeed_MultiCharacterSeedWorks {

    @Test
    public void fromSecretSeed_MultiCharacterSeedWorks() throws GeneralSecurityException {
        byte[] secretSeed = "abcd".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(secretSeed);
        assertNotNull(keyPair.getPublicKey());
    }

}