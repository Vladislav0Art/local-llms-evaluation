package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedEqualsReturnsFalseWhenTwoObjectsAreDifferent {

    @Test
    public void equalsReturnsFalseWhenTwoObjectsAreDifferent() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey();
        KeyPair keyPair1 = new KeyPair(publicKey);
        KeyPair keyPair2 = new KeyPair(new EdDSAPublicKey());
        assertFalse(keyPair1.equals(keyPair2));
    }

}