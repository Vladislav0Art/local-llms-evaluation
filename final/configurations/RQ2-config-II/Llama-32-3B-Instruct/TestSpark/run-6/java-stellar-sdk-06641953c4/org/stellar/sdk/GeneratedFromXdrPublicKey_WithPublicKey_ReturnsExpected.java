package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromXdrPublicKey_WithPublicKey_ReturnsExpected {

    @Test
    public void fromXdrPublicKey_WithPublicKey_ReturnsExpected() {
        PublicKey publicKey = Mockito.mock(PublicKey.class);
        when(publicKey.getEncoded()).thenReturn(new byte[]{1, 2, 3});
        KeyPair keyPair = KeyPair.fromXdrPublicKey(publicKey);
        assertNotNull(keyPair);
    }

}