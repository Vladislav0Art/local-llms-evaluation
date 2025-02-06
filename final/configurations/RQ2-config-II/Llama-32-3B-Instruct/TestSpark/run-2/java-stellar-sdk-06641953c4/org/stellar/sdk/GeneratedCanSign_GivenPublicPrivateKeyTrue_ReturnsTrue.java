package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.Signature;
import java.util.Arrays;

public class GeneratedCanSign_GivenPublicPrivateKeyTrue_ReturnsTrue {

    @Test
    public void canSign_GivenPublicPrivateKeyTrue_ReturnsTrue() {
        boolean canSign = KeyPair.canSign(true, true);
        assertTrue(canSign);
    }

}