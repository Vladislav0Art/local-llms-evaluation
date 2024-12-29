package org.stellar.sdk;

import org.stellar.sdk.KeyPair;
import org.stellar.sdk.PublicKey;
import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedCanSign_givenEdDsapublicKey_returnTrue {

    @Test
    public void canSign_givenEdDsapublicKey_returnTrue() {
        EdDSAPublicKey publicKey = EdDSAPublicKey.fromBytes(new byte[]{1, 2, 3});
        KeyPair keyPair = new KeyPair(publicKey);
        assertTrue(keyPair.canSign());
    }

}