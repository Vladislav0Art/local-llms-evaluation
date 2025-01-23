package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromSecretSeed_ThrowsNullPointerException_WhenSeedIsNotCharArray2 {

    @Test
    public void fromSecretSeed_ThrowsNullPointerException_WhenSeedIsNotCharArray2() {
        try {
            KeyPair.fromSecretSeed(123);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}