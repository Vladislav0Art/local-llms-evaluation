package org.stellar.sdk;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedCanSignTest {

    @Test
    public void canSignTest() {
        EdDSAPublicKey publicKey = mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(publicKey);
        assertFalse(keyPair.canSign());
    }

}