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

public class GeneratedGetAccountId_WhenPublicKeyIsAvailable_ReturnsAccountId {

    @Test
    public void getAccountId_WhenPublicKeyIsAvailable_ReturnsAccountId() {
        PublicKey publicKey = new PublicKey(new byte[]{1, 2, 3});
        when(KeyPair.class, "getPublicKey").thenReturn(publicKey);
        KeyPair keyPair = new KeyPair(publicKey);
        assertEquals(1, keyPair.getAccountId());
    }

}