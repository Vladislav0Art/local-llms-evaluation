package org.stellar.sdk;

import static org.junit.Assert.*;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedFromAccountIdTest {

    @Test
    public void fromAccountIdTest() {
        KeyPair keypair1 = KeyPair.random();
        String accountId = keypair1.getAccountId();
        KeyPair keypair2 = KeyPair.fromAccountId(accountId);
        assertEquals(keypair1, keypair2);
    }

}