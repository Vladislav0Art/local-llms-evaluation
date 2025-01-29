package org.stellar.sdk;

import com.google.common.base.Preconditions;
import org.junit.jupiter.api.Test;

public class GeneratedTestFromXdrSignerKey {

    @Test
    public void testFromXdrSignerKey() {
        SignerKey signerKey = KeyPair.fromXdrSignerKey(SignerKey.fromXdrBytes("signer key bytes"));
        Preconditions.checkArgument(signerKey instanceof EdDSASignerKey, "Expected instance of EdDSASignerKey");
    }

}