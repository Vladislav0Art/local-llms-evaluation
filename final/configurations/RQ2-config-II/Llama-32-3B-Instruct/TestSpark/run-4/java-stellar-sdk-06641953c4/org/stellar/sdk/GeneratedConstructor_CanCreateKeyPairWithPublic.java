package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedConstructor_CanCreateKeyPairWithPublic {

    @Test
    public void constructor_CanCreateKeyPairWithPublic() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey();
        KeyPair keyPair = new KeyPair(publicKey);
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

}