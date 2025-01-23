package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import net.i2p.crypto.eddsa.EdDSAPublicKey;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromAccountId_ThrowsNullPointerException_WhenAccountIdIsNull {

    @Test
    public void fromAccountId_ThrowsNullPointerException_WhenAccountIdIsNull() {
        try {
            KeyPair.fromAccountId(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}