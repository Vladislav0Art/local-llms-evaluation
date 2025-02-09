package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.GeneralSecurityException;

public class GeneratedGetSignatureHintTest {

    @Test
    public void getSignatureHintTest() {
        KeyPair keyPair = KeyPair.random();
        SignatureHint signatureHint = keyPair.getSignatureHint();
        Assert.assertNotNull(signatureHint);
    }

}