package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.Security;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import static org.junit.Assert.*;

public class GeneratedFromPublicKeyTest {

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    @Test
    public void fromPublicKeyTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.fromPublicKey(keyPair1.getPublicKey());
        assertEquals(keyPair1, keyPair2);
    }

}