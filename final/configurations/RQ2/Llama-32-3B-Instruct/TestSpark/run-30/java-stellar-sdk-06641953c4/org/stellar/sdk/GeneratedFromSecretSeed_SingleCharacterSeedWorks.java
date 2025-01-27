package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromSecretSeed_SingleCharacterSeedWorks {

    @Test
    public void fromSecretSeed_SingleCharacterSeedWorks() throws GeneralSecurityException {
        byte[] secretSeed = new byte[]{(byte) 'a'};
        KeyPair keyPair = KeyPair.fromSecretSeed(secretSeed);
        assertNotNull(keyPair.getPublicKey());
    }

}