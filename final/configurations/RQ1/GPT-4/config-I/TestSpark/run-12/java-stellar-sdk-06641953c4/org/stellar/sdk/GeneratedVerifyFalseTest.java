package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.stellar.sdk.xdr.DecoratedSignature;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedVerifyFalseTest {

    @Test
    public void verifyFalseTest() throws GeneralSecurityException {
        KeyPair pair = KeyPair.random();
        String data = "test";
        byte[] signed = pair.sign(data.getBytes());
        assertFalse(pair.verify("different".getBytes(), signed));
    }

}