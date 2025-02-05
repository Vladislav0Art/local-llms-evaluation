package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

public class GeneratedFromAccountIdTest {

    @Test
    public void fromAccountIdTest() {
        assertNotNull(KeyPair.fromAccountId("GDRLK6GNWNUJEDKWIB6YYPUEX55FWPM6KRXSQHXV5SEODRESQ6HRJQBR"));
    }

}