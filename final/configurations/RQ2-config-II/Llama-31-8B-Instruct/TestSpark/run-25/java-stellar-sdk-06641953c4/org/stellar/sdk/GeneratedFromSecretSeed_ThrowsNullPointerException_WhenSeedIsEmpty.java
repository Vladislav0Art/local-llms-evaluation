package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromSecretSeed_ThrowsNullPointerException_WhenSeedIsEmpty {

    @Test
    public void fromSecretSeed_ThrowsNullPointerException_WhenSeedIsEmpty() {
        try {
            KeyPair.fromSecretSeed(new char[]{});
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

}