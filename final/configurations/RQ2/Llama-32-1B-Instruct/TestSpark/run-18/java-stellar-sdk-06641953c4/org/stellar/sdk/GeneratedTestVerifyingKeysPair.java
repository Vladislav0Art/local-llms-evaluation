package org.stellar.sdk;

import com.google.common.base.Preconditions;
import org.junit.Test;

public class GeneratedTestVerifyingKeysPair {

    @Test
    public void testVerifyingKeysPair() {
        Preconditions.checkArgument(true);
        String data = "your_public_data_here";
        KeyPair keyPair = new KeyPair(new EdDSAPublicKeySpec(data));
        boolean verified = verify(keyPair, new EdDSASignatureSpec("your_signature_data_here"));
        Preconditions.checkArgument(Objects.equals(verified, true));
    }

}