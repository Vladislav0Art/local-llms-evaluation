package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import net.i2p.crypto.eddsa.*;

import static org.junit.Assert.*;

public class GeneratedFromXdrPublicKeyNotNullTest {

    @Test
    public void fromXdrPublicKeyNotNullTest() {
        KeyPair keyPair = KeyPair.random();
        PublicKey publicKey = keyPair.getXdrPublicKey();
        KeyPair resultKeyPair = KeyPair.fromXdrPublicKey(publicKey);
        assertNotNull(resultKeyPair);
    }

}