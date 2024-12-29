package org.stellar.sdk;

import org.stellar.sdk.KeyPair;
import org.stellar.sdk.PublicKey;
import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedGetPublicKey_givenKeyPair_returnPublicKey {

    @Test
    public void getPublicKey_givenKeyPair_returnPublicKey() {
        byte[] publicKey = new byte[]{1, 2, 3};
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromBytes(publicKey));
        assertEquals(publicKey, keyPair.getPublicKey());
    }

}