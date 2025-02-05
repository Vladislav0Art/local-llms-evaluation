package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.DecoratedSignature;

public class GeneratedVerifyNullDataTest {

    @Test
    public void verifyNullDataTest() {
        EdDSAPublicKey pubKey = Mockito.mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(pubKey);
        byte[] signature = "signature".getBytes();
        keyPair.verify(null, signature);
    }

}