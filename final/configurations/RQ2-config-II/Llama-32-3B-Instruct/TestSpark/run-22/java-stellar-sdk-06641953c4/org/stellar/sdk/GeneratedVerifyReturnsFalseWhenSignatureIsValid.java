package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedVerifyReturnsFalseWhenSignatureIsValid {

    @Test
    public void verifyReturnsFalseWhenSignatureIsValid() throws Exception {
        KeyPair key = KeyPair.fromSecretSeed(new char[]{1, 2, 3});
        boolean result = key.verify(new byte[]{4, 5, 6}, key.sign(new byte[]{4, 5, 6}));
        assertFalse(result);
    }

}