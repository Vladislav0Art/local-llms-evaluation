package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.SignatureHint;

import static org.junit.Assert.*;

public class GeneratedFromAccountIdNullTest {

    @Test
    public void fromAccountIdNullTest() {
        KeyPair.fromAccountId(null);
    }

}