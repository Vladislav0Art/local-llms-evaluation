package org.stellar.sdk;

import net.i2p.crypto.eddsa.*;
import org.junit.Test;
import org.stellar.sdk.xdr.SignerKey;

import java.security.MessageDigest;

import static org.junit.Assert.*;

public class GeneratedFromXdrSignerKeyTest {

    @Test
    public void fromXdrSignerKeyTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(KeyPair.fromXdrSignerKey(keyPair.getXdrSignerKey()));
    }

}