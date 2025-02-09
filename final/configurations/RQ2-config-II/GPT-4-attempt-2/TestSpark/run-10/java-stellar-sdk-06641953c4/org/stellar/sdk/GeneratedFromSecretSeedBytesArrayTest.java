package org.stellar.sdk;

import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedFromSecretSeedBytesArrayTest {

    @Test
    public void fromSecretSeedBytesArrayTest() {
        byte[] seed = {1, 2, 3, 4, 5};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotEquals(null, keyPair);
    }

}