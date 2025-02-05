package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.KeyPairGenerator;

import static org.junit.Assert.*;

public class GeneratedFromAccountIdTest {

    @Test
    public void fromAccountIdTest() {
        String accountId = "GABHHQZPEIMUJUDVHBVF6B3D4NXC4QIEVJMBXFHXLSZDDOZGZU7C5HL6";
        assertNotNull(KeyPair.fromAccountId(accountId));
    }

}