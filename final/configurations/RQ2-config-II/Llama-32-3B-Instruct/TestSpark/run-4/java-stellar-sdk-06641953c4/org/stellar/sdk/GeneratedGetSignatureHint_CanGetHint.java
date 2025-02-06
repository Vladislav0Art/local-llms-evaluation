package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedGetSignatureHint_CanGetHint {

    @Test
    public void getSignatureHint_CanGetHint() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        assertNotNull(keyPair.getSignatureHint());
        assertTrue(keyPair.getSignatureHint().isValid());
    }

}