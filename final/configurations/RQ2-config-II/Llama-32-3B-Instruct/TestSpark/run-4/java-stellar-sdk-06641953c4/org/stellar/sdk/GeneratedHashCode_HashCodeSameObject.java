package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedHashCode_HashCodeSameObject {

    @Test
    public void hashCode_HashCodeSameObject() {
        KeyPair keyPair1 = new KeyPair(new EdDSAPublicKey());
        KeyPair keyPair2 = new KeyPair(new EdDSAPublicKey());
        assertTrue(keyPair1.hashCode() == keyPair2.hashCode());
    }

}