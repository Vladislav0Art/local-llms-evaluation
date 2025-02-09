package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.KeyPairGenerator;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedCanSignTest {

    @Test
    public void canSignTest() {
        KeyPair pair = KeyPair.random();
        assertTrue(pair.canSign());
    }

}