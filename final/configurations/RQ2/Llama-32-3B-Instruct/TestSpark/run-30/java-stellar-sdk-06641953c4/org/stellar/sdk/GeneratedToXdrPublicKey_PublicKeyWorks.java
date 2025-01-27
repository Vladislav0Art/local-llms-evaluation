package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedToXdrPublicKey_PublicKeyWorks {

    @Test
    public void toXdrPublicKey_PublicKeyWorks() {
        byte[] secretSeed = new byte[]{(byte) 'a'};
        KeyPair keyPair = KeyPair.fromSecretSeed(secretSeed);
        PublicKey publicKey = keyPair.getXdrPublicKey();
        assertEquals(publicKey, PublicFactory.fromBase64(keyPair.getPublicKey()));
    }

}