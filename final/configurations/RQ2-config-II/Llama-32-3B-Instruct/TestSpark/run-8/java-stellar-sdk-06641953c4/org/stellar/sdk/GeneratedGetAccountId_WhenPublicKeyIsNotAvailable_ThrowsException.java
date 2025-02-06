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

public class GeneratedGetAccountId_WhenPublicKeyIsNotAvailable_ThrowsException {

    @Test
    public void getAccountId_WhenPublicKeyIsNotAvailable_ThrowsException() {
        when(KeyPair.class, "getPublicKey").thenReturn(new byte[]{});
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        assertThrows(NullPointerException.class, () -> keyPair.getAccountId());
    }

}