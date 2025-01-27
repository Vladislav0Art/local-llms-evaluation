package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedVerify_SingleCharacterSeedWorks {

    @Test
    public void verify_SingleCharacterSeedWorks() throws GeneralSecurityException, IOException {
        byte[] secretSeed = new byte[]{(byte) 'a'};
        byte[] signature = KeyPair.fromSecretSeed(secretSeed).sign(new byte[0]);
        assertTrue(KeyPair.fromSecretSeed(secretSeed).verify(new byte[0], signature));
    }

}