package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.SecureRandom;

import static org.junit.Assert.*;

public class GeneratedFromXdrSignerKeyTest {

    @Test
    public void fromXdrSignerKeyTest() {
        KeyPair keyPair1 = KeyPair.random();
        SignerKey signerKey = keyPair1.getXdrSignerKey();
        KeyPair keyPair2 = KeyPair.fromXdrSignerKey(signerKey);
        assertEquals(keyPair1, keyPair2);
    }

}