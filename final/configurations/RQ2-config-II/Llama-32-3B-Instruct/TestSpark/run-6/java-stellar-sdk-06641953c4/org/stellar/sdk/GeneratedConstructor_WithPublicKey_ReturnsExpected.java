package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConstructor_WithPublicKey_ReturnsExpected {

    @Test
    public void constructor_WithPublicKey_ReturnsExpected() {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        when(publicKey.getEncoded()).thenReturn(new byte[]{1, 2, 3});
        KeyPair keyPair = new KeyPair(publicKey);
        assertNotNull(keyPair);
    }

}