package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCreateKeyPairFromPublic {

    @Test
    public void createKeyPairFromPublic() {
        EdDSAPublicKey publicKey = EdDSAEngine.generate();
        KeyPair keyPair = new KeyPair(publicKey);
        assertNotNull(keyPair);
    }

}