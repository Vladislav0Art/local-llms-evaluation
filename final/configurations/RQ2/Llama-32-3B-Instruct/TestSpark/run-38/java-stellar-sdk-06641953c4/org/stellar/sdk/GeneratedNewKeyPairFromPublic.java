package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNewKeyPairFromPublic {

    @Test
    public void newKeyPairFromPublic() {
        EdDSAPublicKey publicKey = createEdDsapublickey();
        KeyPair keyPair = KeyPair.fromPublic(publicKey.getEncoded());
        assertNotNull(keyPair);
    }

}