package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.stellar.sdk.KeyPair;

public class GeneratedGetPublicKey {

    @Test
    public void getPublicKey() {
        byte[] publicKey = new byte[64];
        EdDSAPublicKey keyPublic = new EdDSAPublicKey();
        keyPublic.setBytes(publicKey);
        KeyPair keyPair = new KeyPair(keyPublic);
        assertNotNull(keyPair.getPublicKey());
        assertEquals(Arrays.toString(publicKey), Arrays.toString(keyPair.getPublicKey()));
    }

}