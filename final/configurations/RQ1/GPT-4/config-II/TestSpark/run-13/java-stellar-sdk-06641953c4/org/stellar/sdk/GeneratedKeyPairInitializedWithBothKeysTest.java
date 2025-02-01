package org.stellar.sdk;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;

import org.junit.Test;
import org.stellar.sdk.*;

public class GeneratedKeyPairInitializedWithBothKeysTest {

    @Test
    public void KeyPairInitializedWithBothKeysTest() {
        EdDSAPublicKey pk = StellarSDKTestUtils.mockPublicKey();
        EdDSAPrivateKey privk = StellarSDKTestUtils.mockPrivateKey();
        KeyPair keyPair = new KeyPair(pk, privk);
        assertTrue(keyPair.canSign());
    }

}