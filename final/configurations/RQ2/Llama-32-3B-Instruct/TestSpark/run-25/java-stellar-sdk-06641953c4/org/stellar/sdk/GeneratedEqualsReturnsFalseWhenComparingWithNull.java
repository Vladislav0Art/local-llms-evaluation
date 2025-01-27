package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedEqualsReturnsFalseWhenComparingWithNull {

    @Test
    public void equalsReturnsFalseWhenComparingWithNull() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey();
        KeyPair keyPair = new KeyPair(publicKey);
        assertFalse(keyPair.equals(null));
    }

}