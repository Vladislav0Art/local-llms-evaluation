package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromXdrPublicKey_PublicKeyWorks {

    @Test
    public void fromXdrPublicKey_PublicKeyWorks() {
        PublicKey publicKey = PublicKeyFactory.fromBase64("x8p...h9");
        KeyPair keyPair = KeyPair.fromXdrPublicKey(publicKey);
        assertNotNull(keyPair.getPublicKey());
    }

}