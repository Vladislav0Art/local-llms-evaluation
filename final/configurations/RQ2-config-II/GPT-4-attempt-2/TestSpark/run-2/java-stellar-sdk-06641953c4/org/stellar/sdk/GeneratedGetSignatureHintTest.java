package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.KeyPairGenerator;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedGetSignatureHintTest {

    @Test
    public void getSignatureHintTest() {
        KeyPair pair = KeyPair.random();
        assertNotNull(pair.getSignatureHint());
    }

}