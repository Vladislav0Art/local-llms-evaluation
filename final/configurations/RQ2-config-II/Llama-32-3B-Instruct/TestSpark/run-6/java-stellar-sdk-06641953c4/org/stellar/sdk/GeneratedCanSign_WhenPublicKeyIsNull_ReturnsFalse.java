package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCanSign_WhenPublicKeyIsNull_ReturnsFalse {

    @Test
    public void canSign_WhenPublicKeyIsNull_ReturnsFalse() {
        KeyPair keyPair = new KeyPair(null);
        assertFalse(keyPair.canSign());
    }

}