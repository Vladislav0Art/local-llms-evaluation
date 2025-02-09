package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedEqualsWithDifferentKeyPairReturnsFalse {

    @Test
    public void equalsWithDifferentKeyPairReturnsFalse() {
        KeyPair keyPair1 = new KeyPair();
        KeyPair keyPair2 = new KeyPair();
        assertFalse(keyPair1.equals(new Object()));
    }

}