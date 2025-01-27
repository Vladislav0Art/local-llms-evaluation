package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedSign_SingleCharacterSeedWorks {

    @Test
    public void sign_SingleCharacterSeedWorks() throws GeneralSecurityException, IOException {
        byte[] secretSeed = new byte[]{(byte) 'a'};
        KeyPair keyPair = KeyPair.fromSecretSeed(secretSeed);
        assertEquals(keyPair.getPublicKey(), keyPair.sign(new byte[0]));
    }

}