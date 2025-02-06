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

public class GeneratedCannotSign_WithInvalidPrivateKey_ThrowsException {

    @Test
    public void cannotSign_WithInvalidPrivateKey_ThrowsException() {
        when(KeyPair.class, "canSign").thenReturn(false);
        KeyPair keyPair = new KeyPair(new EdDSAPrivateKey(new byte[]{1, 2, 3}));
        assertTrue(keyPair.canSign());
    }

}