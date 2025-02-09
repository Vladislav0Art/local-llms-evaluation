package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedGetPublickeyReturnsValidPublicKey {

    @Test
    public void getPublickeyReturnsValidPublicKey() {
        byte[] publicKey = createByteArray("publickey");
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotNull(keyPair.getPublicKey());
    }

}