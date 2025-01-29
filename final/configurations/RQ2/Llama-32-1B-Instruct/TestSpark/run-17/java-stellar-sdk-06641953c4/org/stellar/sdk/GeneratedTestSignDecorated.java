package org.stellar.sdk;

import com.google.common.base.Preconditions;
import org.junit.jupiter.api.Test;

public class GeneratedTestSignDecorated {

    @Test
    public void testSignDecorated() {
        String signerPayload = "signer payload";
        byte[] signerPayloadBytes = signerPayload.getBytes();
        DecoratedSignature signature = KeyPair.signDecorated(signerPayloadBytes);
        Preconditions.checkArgument(signature != null, "Expected non-null signature");
    }

}