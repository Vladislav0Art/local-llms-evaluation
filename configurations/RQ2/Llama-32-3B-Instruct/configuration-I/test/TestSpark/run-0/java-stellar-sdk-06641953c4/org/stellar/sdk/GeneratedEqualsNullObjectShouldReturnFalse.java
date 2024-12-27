package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedEqualsNullObjectShouldReturnFalse {

    @Test
    public void equalsNullObjectShouldReturnFalse() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        assertFalse(keyPair.equals(null));
    }

}