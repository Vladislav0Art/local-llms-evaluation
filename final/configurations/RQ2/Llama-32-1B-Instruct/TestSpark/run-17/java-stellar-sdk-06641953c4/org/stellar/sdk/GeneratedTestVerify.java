package org.stellar.sdk;

import com.google.common.base.Preconditions;
import org.junit.jupiter.api.Test;

public class GeneratedTestVerify {

    @Test
    public void testVerify() {
        String data = "some data";
        byte[] signature = "signature bytes";
        boolean verify = KeyPair.verify(data, signature);
        Preconditions.checkArgument(verify, "Expected true or false for verification");
    }

}