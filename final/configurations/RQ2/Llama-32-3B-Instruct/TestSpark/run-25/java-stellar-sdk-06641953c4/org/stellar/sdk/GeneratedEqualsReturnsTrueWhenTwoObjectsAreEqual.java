package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedEqualsReturnsTrueWhenTwoObjectsAreEqual {

    @Test
    public void equalsReturnsTrueWhenTwoObjectsAreEqual() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey();
        KeyPair keyPair1 = new KeyPair(publicKey);
        KeyPair keyPair2 = new KeyPair(publicKey);
        assertTrue(keyPair1.equals(keyPair2));
    }

}