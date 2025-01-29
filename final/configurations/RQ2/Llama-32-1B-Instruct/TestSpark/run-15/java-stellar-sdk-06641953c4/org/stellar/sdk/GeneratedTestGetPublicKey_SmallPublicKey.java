package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetPublicKey_SmallPublicKey {

    @Test
    public void testGetPublicKey_SmallPublicKey() {
        byte[] smallPublicKey = "small_public_key".getBytes();
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey("eddsa_key"));
        assertEquals(smallPublicKey, keyPair.getPublicKey());
    }

}