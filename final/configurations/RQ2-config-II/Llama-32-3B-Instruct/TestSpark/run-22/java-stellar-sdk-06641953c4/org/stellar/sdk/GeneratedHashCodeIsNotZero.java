package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedHashCodeIsNotZero {

    @Test
    public void hashCodeIsNotZero() {
        KeyPair key = new KeyPair(mock(EdDSAPublicKey.class));
        assertNotEquals(0, key.hashCode());
    }
}

}