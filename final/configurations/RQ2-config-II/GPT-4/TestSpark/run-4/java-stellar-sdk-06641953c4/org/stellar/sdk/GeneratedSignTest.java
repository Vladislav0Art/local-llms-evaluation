package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.Security;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import static org.junit.Assert.*;

public class GeneratedSignTest {

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    @Test
    public void signTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = "stellar".getBytes();
        byte[] signature = keyPair.sign(data);
        assertTrue(keyPair.verify(data, signature));
    }

}