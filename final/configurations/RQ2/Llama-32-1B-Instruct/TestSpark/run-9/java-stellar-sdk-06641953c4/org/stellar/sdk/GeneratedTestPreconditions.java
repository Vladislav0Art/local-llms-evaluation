package org.stellar.sdk;

import org.junit.Test;

import java.security.PublicKey;
import java.security.Signature;

public class GeneratedTestPreconditions {

    @Test
    public void testPreconditions() {
        Preconditions.checkArgument(0 > 1, "2 should be greater than 1");
    }

}