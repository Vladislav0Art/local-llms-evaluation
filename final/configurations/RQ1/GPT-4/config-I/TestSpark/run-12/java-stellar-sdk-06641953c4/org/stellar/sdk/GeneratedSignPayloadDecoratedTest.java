package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.stellar.sdk.xdr.DecoratedSignature;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedSignPayloadDecoratedTest {

    @Test
    public void signPayloadDecoratedTest() {
        KeyPair pair = KeyPair.random();
        byte[] signerPayload = "payload".getBytes();
        DecoratedSignature signature = pair.signPayloadDecorated(signerPayload);
        assertNotNull(signature);
    }

}