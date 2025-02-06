package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromPublicKey_CanCreateKeyPairWithPublic {

    @Test
    public void fromPublicKey_CanCreateKeyPairWithPublic() {
        byte[] publicKey = new byte[32];
        Arrays.fill(publicKey, (byte) 0x00);
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

}