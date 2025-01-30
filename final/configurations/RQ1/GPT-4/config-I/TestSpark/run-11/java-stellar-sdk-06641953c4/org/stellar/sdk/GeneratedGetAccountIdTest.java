package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.Uint256;

import java.security.KeyPairGenerator;

import static org.junit.Assert.*;

public class GeneratedGetAccountIdTest {

    @Test
    public void getAccountIdTest() {
        byte[] publicKey = new byte[32];

        assertEquals("GAAA...", KeyPair.fromPublicKey(publicKey).getAccountId());
    }

}