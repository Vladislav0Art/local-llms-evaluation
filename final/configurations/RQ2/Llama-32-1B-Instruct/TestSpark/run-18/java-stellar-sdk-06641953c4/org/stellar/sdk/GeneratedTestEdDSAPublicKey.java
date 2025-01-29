package org.stellar.sdk;

import com.google.common.base.Preconditions;
import org.junit.Test;

public class GeneratedTestEdDSAPublicKey {

    @Test
    public void testEdDSAPublicKey() {
        Preconditions.checkArgument(true);
        EdDSAPublicKeySpec publicKey = new EdDSAPublicKeySpec("your_public_data_here");
        EdDSAPublicKey publicKeyData = fromXdrPublicKey(publicKey);
        Preconditions.checkArgument(Objects.equals( public,publicKeyData));
    }

}