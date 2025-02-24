package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestCanSign {

    @Test
    public void testCanSign() {
        KeyPair keyPair = new KeyPair(null);
        assertFalse(keyPair.canSign());
    }

}