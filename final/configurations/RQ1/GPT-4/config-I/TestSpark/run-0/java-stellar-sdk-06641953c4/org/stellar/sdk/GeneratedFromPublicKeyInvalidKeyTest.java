package org.stellar.sdk;

import org.junit.Test;
import net.i2p.crypto.eddsa.*;
import net.i2p.crypto.eddsa.spec.*;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedFromPublicKeyInvalidKeyTest {

    @Test
    public void fromPublicKeyInvalidKeyTest() {
        KeyPair.fromPublicKey(new byte[33]);
    }

}