package org.stellar.sdk;

import org.stellar.sdk.*;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedGetSignatureHint_GivenKeyPair_ReturnsSignatureHint {

    @Test
    public void getSignatureHint_GivenKeyPair_ReturnsSignatureHint() {
        SignatureHint signatureHint = new SignatureHint();
        KeyPair keyPair = new KeyPair(signatureHint);
        assertEquals(signatureHint, keyPair.getSignatureHint());
    }

}