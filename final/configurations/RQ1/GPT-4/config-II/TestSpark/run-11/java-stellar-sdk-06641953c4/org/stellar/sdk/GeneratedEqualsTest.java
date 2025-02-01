package org.stellar.sdk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.stellar.sdk.*;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = keyPair1;
        assertTrue(keyPair1.equals(keyPair2));

        KeyPair keyPair3 = KeyPair.random();
        assertFalse(keyPair1.equals(keyPair3));
    }

}