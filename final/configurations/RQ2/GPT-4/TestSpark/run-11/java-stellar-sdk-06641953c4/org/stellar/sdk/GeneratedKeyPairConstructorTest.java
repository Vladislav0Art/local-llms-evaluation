package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

public class GeneratedKeyPairConstructorTest {

    @Test
    public void keyPairConstructorTest() {
        EdDSAPublicKey edDSAPublicKey = new EdDSAPublicKey("SomePublicKey");
        KeyPair keyPair = new KeyPair(edDSAPublicKey);
        assertNotNull(keyPair);
    }

}