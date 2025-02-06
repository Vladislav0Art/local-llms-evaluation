package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetPublicKeyIsBytes {

    @Test
    public void getPublicKeyIsBytes() {
        byte[] publicKey = EdDSAPublicKey.getEncoded();
        KeyPair keyPair = new KeyPair(EdDSAEngine.generate());
        assertNot null (keyPair.getPublicKey());
        assertTrue((keyPair.getPublicKey()).length > 0);
    }

}