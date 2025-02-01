package org.stellar.sdk;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;

import org.junit.Test;
import org.stellar.sdk.*;

public class GeneratedKeyPairInitializedWithPublicKeyTest {

    @Test
    public void KeyPairInitializedWithPublicKeyTest() {
        EdDSAPublicKey pk = StellarSDKTestUtils.mockPublicKey();
        KeyPair keyPair = new KeyPair(pk);
        assertTrue(keyPair.canSign() == false);
    }

}