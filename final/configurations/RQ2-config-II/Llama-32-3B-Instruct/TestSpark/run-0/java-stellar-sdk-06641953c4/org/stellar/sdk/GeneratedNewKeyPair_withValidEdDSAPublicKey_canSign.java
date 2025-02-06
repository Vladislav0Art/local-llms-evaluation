package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.security.GeneralSecurityException;

public class GeneratedNewKeyPair_withValidEdDSAPublicKey_canSign {

    @Test
    public void newKeyPair_withValidEdDSAPublicKey_canSign() {
        EdDSAPublicKey publicKey = EdDSAPublicKey.generate();
        KeyPair keyPair = new KeyPair(publicKey);
        assertTrue(keyPair.canSign());
    }

}