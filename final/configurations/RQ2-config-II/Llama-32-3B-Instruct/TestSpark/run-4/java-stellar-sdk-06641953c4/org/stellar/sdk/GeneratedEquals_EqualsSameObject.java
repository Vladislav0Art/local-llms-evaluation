package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedEquals_EqualsSameObject {

    @Test
    public void equals_EqualsSameObject() {
        KeyPair keyPair1 = new KeyPair(new EdDSAPublicKey());
        KeyPair keyPair2 = new KeyPair(new EdDSAPublicKey());
        assertEquals(keyPair1, keyPair2);
    }

}