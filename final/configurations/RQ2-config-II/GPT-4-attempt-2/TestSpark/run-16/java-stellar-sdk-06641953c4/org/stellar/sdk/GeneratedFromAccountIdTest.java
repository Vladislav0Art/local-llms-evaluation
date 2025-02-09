package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.SecureRandom;

import static org.junit.Assert.*;

public class GeneratedFromAccountIdTest {

    @Test
    public void fromAccountIdTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.fromAccountId(keyPair1.getAccountId());
        assertEquals(keyPair1, keyPair2);
    }

}