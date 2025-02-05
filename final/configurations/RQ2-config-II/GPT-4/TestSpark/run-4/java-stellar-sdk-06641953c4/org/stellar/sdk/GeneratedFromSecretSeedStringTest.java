package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.Security;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeedStringTest {

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    @Test
    public void fromSecretSeedStringTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed("SA6XHAH4GNLRWWWF6TEVEWNS44CBNFAJWHWOPZCVZOUXSQA7BOYN4X4K");
        assertEquals("GAB5GZDJGZ5EZD3VOOU4OZ5JJ6BPKHLBOMISOHYNYUR7AYUYIAXBEDTQ", keyPair.getAccountId());
    }

}