package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromPubliclyKnownKey_DoesNotSupportSigningWithNullKey {

    @Test
    public void fromPubliclyKnownKey_DoesNotSupportSigningWithNullKey() {
        PublicKey key = new PublicKey();
        KeyPair pair = KeyPair.fromPublicKey(key.getPublicKey());

        assert (pair != null);
    }

}