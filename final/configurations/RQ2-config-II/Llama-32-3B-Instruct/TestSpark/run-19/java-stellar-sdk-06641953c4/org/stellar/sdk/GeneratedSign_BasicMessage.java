package org.stellar.sdk;

import org.stellar.sdk.KeyPair;
import org.junit.Test;

import static org.junit.Assert.*;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedSign_BasicMessage {

    @Test
    public void sign_BasicMessage() throws GeneralSecurityException {
        byte[] data = "Hello".getBytes();
        KeyPair keyPair = new KeyPair(EdDSAPrivateKey.generate().getPublicKey());
        byte[] signature = keyPair.sign(data);
        assertNotNull(signature);
    }

}