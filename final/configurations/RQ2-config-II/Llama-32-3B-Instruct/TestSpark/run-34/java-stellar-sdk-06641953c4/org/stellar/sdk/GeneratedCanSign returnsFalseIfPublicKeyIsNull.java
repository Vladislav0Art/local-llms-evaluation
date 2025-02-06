package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedCanSign returnsFalseIfPublicKeyIsNull {

    @Test
    public void canSign

    returnsFalseIfPublicKeyIsNull() {
        KeyPair keyPair = KeyPair.fromPublickey(null);
        assertFalse(keyPair.canSign());
    }

}