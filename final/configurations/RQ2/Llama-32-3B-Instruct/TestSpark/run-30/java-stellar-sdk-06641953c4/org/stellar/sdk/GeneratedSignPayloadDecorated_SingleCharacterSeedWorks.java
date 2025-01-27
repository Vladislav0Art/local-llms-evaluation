package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedSignPayloadDecorated_SingleCharacterSeedWorks {

    @Test
    public void signPayloadDecorated_SingleCharacterSeedWorks() throws GeneralSecurityException, IOException {
        byte[] secretSeed = new byte[]{(byte) 'a'};
        KeyPair keyPair = KeyPair.fromSecretSeed(secretSeed);
        assertEquals(keyPair.getPublicKey(), keyPair.signPayloadDecorated(new byte[0]));
    }

}