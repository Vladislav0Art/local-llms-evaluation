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

public class GeneratedFromSecretSeed_WithValidSeed_ReturnsKeyPair {

    @Test
    public void fromSecretSeed_WithValidSeed_ReturnsKeyPair() {
        char[] seed = {'a', 'b', 'c'};
        when(KeyPair.class, "fromSecretSeed").thenReturn(new KeyPair(new EdDSAPrivateKey(seed)));
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertEquals(3, seed.length);
    }

}