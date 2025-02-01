package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;

import java.security.SecureRandom;
import java.util.Random;

public class GeneratedFromPublicKeyInvalidTest {

    @Test
    public void fromPublicKeyInvalidTest() {
        String publicKeyString = "Invalid Public Key";
        byte[] publicKey = publicKeyString.getBytes();

        KeyPair.fromPublicKey(publicKey);
    }

}