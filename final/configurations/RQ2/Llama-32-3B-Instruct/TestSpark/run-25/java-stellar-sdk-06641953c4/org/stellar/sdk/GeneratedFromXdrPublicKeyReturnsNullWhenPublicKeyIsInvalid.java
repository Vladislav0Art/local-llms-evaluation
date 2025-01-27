package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromXdrPublicKeyReturnsNullWhenPublicKeyIsInvalid {

    @Test
    public void fromXdrPublicKeyReturnsNullWhenPublicKeyIsInvalid() {
        PublicKey publicKey = null;
        KeyPair keyPair = KeyPair.fromXdrPublicKey(publicKey);
        assertNull(keyPair);
    }

}