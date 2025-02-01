package org.stellar.sdk;

import net.i2p.crypto.eddsa.*;
import org.junit.Test;
import org.stellar.sdk.xdr.SignerKey;

import java.security.MessageDigest;

import static org.junit.Assert.*;

public class GeneratedFromXdrPublicKeyTest {

    @Test
    public void fromXdrPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(KeyPair.fromXdrPublicKey(keyPair.getXdrPublicKey()));
    }

}