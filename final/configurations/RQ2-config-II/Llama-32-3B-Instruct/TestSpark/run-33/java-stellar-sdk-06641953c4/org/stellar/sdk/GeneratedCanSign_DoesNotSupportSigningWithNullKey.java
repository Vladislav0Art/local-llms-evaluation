package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedCanSign_DoesNotSupportSigningWithNullKey {

    @Test
    public void canSign_DoesNotSupportSigningWithNullKey() {
        assertNull(KeyPair.of(null));
    }

}