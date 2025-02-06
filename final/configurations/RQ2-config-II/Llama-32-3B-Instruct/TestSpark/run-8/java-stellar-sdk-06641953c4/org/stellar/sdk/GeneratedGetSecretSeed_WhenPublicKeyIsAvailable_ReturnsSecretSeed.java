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

public class GeneratedGetSecretSeed_WhenPublicKeyIsAvailable_ReturnsSecretSeed {

    @Test
    public void getSecretSeed_WhenPublicKeyIsAvailable_ReturnsSecretSeed() {
        PublicKey publicKey = new PublicKey(new byte[]{1, 2, 3});
        when(KeyPair.class, "getPublicKey").thenReturn(publicKey);
        KeyPair keyPair = new KeyPair(publicKey);
        assertEquals(3, keyPair.getSecretSeed().length);
    }

}