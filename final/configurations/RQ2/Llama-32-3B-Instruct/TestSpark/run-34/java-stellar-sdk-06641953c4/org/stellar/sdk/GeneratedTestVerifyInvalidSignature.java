package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestVerifyInvalidSignature {

    @Test
    public void testVerifyInvalidSignature() throws Exception {
        KeyPair keyPair = new KeyPair(new byte[]{1, 2, 3}, new byte[]{4, 5, 6});
        Signature signature = new Signature("signature_data");
        assertFalse(keyPair.verify(signature.getData()));
    }
}

}