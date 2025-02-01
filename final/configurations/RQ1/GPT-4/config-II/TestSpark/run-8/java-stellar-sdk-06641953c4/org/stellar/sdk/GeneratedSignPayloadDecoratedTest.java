package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.GeneralSecurityException;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedSignPayloadDecoratedTest {

    @Test
    public void signPayloadDecoratedTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = new byte[32];
        new java.security.SecureRandom().nextBytes(data);
        assertNotNull(keyPair.signPayloadDecorated(data));
    }

}