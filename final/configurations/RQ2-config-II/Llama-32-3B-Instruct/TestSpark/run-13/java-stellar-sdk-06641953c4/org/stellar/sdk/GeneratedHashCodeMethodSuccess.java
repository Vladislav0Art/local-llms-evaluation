package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedHashCodeMethodSuccess {

    @Test
    public void hashCodeMethodSuccess() {
        KeyPair keyPair = new KeyPair(Mockito.mock(EdDSAPublicKey.class));
        int expectedHashcode = 1234;
        assertEquals(expectedHashcode, keyPair.hashCode());
    }

}