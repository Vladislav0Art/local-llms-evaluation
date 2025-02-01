package org.stellar.sdk;

import net.i2p.crypto.eddsa.*;
import org.junit.Test;
import org.stellar.sdk.xdr.SignerKey;

import java.security.MessageDigest;

import static org.junit.Assert.*;

public class GeneratedGetXdrPublicKeyTest {

    @Test
    public void getXdrPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getXdrPublicKey());
    }

}