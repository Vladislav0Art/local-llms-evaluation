package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromPublicKeyTest_InvalidPublicKey {

    @Test
    public void fromPublicKeyTest_InvalidPublicKey() {
        try {
            KeyPair.fromPublicKey(new byte[33]);
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // expected
        }
    }

}