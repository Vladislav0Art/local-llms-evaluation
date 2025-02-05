package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.mockito.Mockito.mock;

public class GeneratedGetSignatureHintTest {

    @Test
    public void getSignatureHintTest() {
        KeyPair pair = KeyPair.random();
        SignatureHint signatureHint = pair.getSignatureHint();
        Assert.assertNotNull(signatureHint);
    }

}