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

public class GeneratedFromSecretSeed_WithInvalidSeed_ReturnsNull {

    @Test
    public void fromSecretSeed_WithInvalidSeed_ReturnsNull() {
        char[] seed = {};
        when(KeyPair.class, "fromSecretSeed").thenReturn(null);
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNull(keyPair);
    }

}