package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.Uint256;
import org.stellar.sdk.xdr.SignatureHint;

import java.nio.ByteBuffer;

import static org.junit.Assert.*;

public class GeneratedKeyPairConstructorTest {

    @Test
    public void keyPairConstructorTest() {
        byte[] pubByteArray = new byte[32];
        EdDSAPublicKeySpec spec = new EdDSAPublicKeySpec(pubByteArray, null);
        EdDSAPublicKey publicKey = new EdDSAPublicKey(spec);
        KeyPair keyPair = new KeyPair(publicKey);
        assertNotNull(keyPair);
    }

}