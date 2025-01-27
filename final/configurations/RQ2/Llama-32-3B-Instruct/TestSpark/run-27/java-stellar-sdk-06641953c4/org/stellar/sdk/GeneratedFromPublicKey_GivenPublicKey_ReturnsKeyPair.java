package org.stellar.sdk;

import org.stellar.sdk.*;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedFromPublicKey_GivenPublicKey_ReturnsKeyPair {

    @Test
    public void fromPublicKey_GivenPublicKey_ReturnsKeyPair() {
        byte[] publicKey = new byte[32];
        Arrays.fill(publicKey, 0x00);
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotNull(keyPair);
    }

}