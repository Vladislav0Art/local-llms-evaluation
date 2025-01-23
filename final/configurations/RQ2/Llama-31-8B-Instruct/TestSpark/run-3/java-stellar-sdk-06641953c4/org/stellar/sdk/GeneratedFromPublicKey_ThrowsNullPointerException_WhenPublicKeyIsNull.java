package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromPublicKey_ThrowsNullPointerException_WhenPublicKeyIsNull {

    @Test
    public void fromPublicKey_ThrowsNullPointerException_WhenPublicKeyIsNull() {
        try {
            KeyPair.fromPublicKey(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}