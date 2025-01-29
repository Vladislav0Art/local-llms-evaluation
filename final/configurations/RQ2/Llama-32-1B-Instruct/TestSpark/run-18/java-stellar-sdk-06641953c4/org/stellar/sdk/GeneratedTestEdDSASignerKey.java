package org.stellar.sdk;

import com.google.common.base.Preconditions;
import org.junit.Test;

public class GeneratedTestEdDSASignerKey {

    @Test
    public void testEdDSASignerKey() {
        Preconditions.checkArgument(true);
        EdDSASignatureSpec signatureSpec = new EdDSASignatureSpec("your_signature_data_here");
        return fromXdrSignature(signatureSpec);
    }

}