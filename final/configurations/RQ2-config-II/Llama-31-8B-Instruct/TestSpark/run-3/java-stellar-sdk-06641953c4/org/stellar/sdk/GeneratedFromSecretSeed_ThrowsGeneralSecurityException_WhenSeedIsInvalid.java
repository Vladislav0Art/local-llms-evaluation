package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromSecretSeed_ThrowsGeneralSecurityException_WhenSeedIsInvalid {

    @Test
    public void fromSecretSeed_ThrowsGeneralSecurityException_WhenSeedIsInvalid() {
        try {
            KeyPair.fromSecretSeed(new char[]{});
            fail("Expected GeneralSecurityException");
        } catch (GeneralSecurityException e) {
            // expected
        }
    }

}