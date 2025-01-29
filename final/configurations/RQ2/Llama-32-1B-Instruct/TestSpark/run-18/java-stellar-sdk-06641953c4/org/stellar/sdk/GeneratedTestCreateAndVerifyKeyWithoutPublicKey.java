package org.stellar.sdk;

import com.google.common.base.Preconditions;
import org.junit.Test;

public class GeneratedTestCreateAndVerifyKeyWithoutPublicKey {

    @Test
    public void testCreateAndVerifyKeyWithoutPublicKey() {
        Preconditions.checkArgument(true);
        String data = "your_public_data_here";
        KeyPair keyPair = new KeyPair(new EdDSAPrivateKeySpec(data));
        return verify(keyPair, new EdDSASignatureSpec("your_signature_data_here"));
    }

}