package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.Signature;
import java.util.Arrays;

public class GeneratedCanSign_GivenPublicPrivateKeyFalse_ReturnsFalse {

    @Test
    public void canSign_GivenPublicPrivateKeyFalse_ReturnsFalse() {
        boolean canSign = KeyPair.canSign(false, false);
        assertFalse(canSign);
    }

}