package org.stellar.sdk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.stellar.sdk.KeyPair;
import org.stellar.sdk.xdr.DecoratedSignature;

public class GeneratedTest {

    @Test
    public void testGetAccountId() {
        KeyPair keypair = KeyPair.random();
        assertEquals(keypair.getAccountId(), StrKey.encodeStellarAccountId(keypair.getPublicKey()));
    }

}