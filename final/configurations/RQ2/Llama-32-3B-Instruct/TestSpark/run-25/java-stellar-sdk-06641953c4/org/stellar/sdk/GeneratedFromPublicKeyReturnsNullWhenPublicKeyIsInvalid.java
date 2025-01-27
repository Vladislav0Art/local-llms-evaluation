package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromPublicKeyReturnsNullWhenPublicKeyIsInvalid {

    @Test
    public void fromPublicKeyReturnsNullWhenPublicKeyIsInvalid() {
        byte[] publicKey = new byte[0];
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNull(keyPair);
    }

}