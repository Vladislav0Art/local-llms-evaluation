package org.stellar.sdk;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEqualsHandlesIncorrectInput {

    @BeforeClass
    public static void setup() {
        // Setup is not needed for this test class
    }

    @Test
    public void equalsHandlesIncorrectInput() {
        KeyPair keyPair1 = new KeyPair();
        KeyPair keyPair2 = new KeyPair();

        when(keyPair1.getPublicKey()).thenReturn(Mockito.mock(byte[].class));
        when(keyPair2.getPublicKey()).thenReturn(Mockito.mock(byte[].class));

        assertFalse(keyPair1.equals(null));
    }

}