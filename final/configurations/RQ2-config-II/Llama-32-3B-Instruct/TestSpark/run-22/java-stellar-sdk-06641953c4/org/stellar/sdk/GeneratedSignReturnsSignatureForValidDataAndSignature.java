package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedSignReturnsSignatureForValidDataAndSignature {

    @Test
    public void signReturnsSignatureForValidDataAndSignature() throws Exception {
        KeyPair key = KeyPair.fromSecretSeed(new char[]{1, 2, 3});
        byte[] signature = key.sign(new byte[]{4, 5, 6});
        assertNotNull(signature);
    }

}