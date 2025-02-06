package org.stellar.sdk;

import org.stellar.sdk.KeyPair;
import org.stellar.sdk.EdDSAPrivateKey;
import org.stellar.sdk.EdDSAPublicKey;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedGetPublicSignatureHint_WhenSigningIsSupported_ReturnsCorrectValue {

    @Test
    public void getPublicSignatureHint_WhenSigningIsSupported_ReturnsCorrectValue() {
        when(KeyPair.class, "sign").thenReturn(null);
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        assertEquals("public", keyPair.getSignatureHint());
    }

}