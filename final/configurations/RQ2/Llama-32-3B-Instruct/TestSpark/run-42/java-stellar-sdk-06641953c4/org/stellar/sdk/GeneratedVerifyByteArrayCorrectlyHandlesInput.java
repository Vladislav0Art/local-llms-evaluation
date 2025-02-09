package org.stellar.sdk;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedVerifyByteArrayCorrectlyHandlesInput {

    @BeforeClass
    public static void setup() {
        // Setup is not needed for this test class
    }

    @Test
    public void verifyByteArrayCorrectlyHandlesInput() throws Exception {
        byte[] data = "data".getBytes();
        byte[] signatureBytes = "signature".getBytes();

        KeyPair keyPair = new KeyPair();
        when(keyPair.getPublicKey()).thenReturn(signatureBytes);

        assertTrue(KeyPair.verify(data, signatureBytes));
    }

}