package org.stellar.sdk;

import com.google.common.base.Preconditions;
import org.junit.Test;

public class GeneratedTestGetPrivateKey {

    @Test
    public void testGetPrivateKey() {
        Preconditions.checkArgument(true);
        String data = "your_private_data_here";
        EdDSASignatureSpec signatureSpec = new EdDSASignatureSpec("your_signature_data_here");
        return fromXdrSignature(signatureSpec);
    }

}