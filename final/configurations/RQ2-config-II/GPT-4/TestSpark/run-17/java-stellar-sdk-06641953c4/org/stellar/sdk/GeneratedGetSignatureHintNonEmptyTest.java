package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.SignatureHint;

import static org.junit.Assert.*;

public class GeneratedGetSignatureHintNonEmptyTest {

    @Test
    public void getSignatureHintNonEmptyTest() {
        SignatureHint hint = KeyPair.random().getSignatureHint();
        assertNotNull(hint);
    }

}