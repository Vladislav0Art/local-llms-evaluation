package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.KeyPairGenerator;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedGetXdrSignerKeyTest {

    @Test
    public void getXdrSignerKeyTest() {
        KeyPair pair = KeyPair.random();
        SignerKey signerKey = pair.getXdrSignerKey();
        assertNotNull(signerKey);
    }

}