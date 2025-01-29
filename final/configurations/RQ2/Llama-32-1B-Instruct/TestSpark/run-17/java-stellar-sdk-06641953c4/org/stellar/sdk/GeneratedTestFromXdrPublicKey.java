package org.stellar.sdk;

import com.google.common.base.Preconditions;
import org.junit.jupiter.api.Test;

public class GeneratedTestFromXdrPublicKey {

    @Test
    public void testFromXdrPublicKey() {
        PublicKey publicKey = KeyPair.fromXdrPublicKey(PublicKey.fromXdrBytes("public key bytes"));
        Preconditions.checkArgument(publicKey instanceof EdDSAPublicKey, "Expected instance of EdDSAPublicKey");
    }

}