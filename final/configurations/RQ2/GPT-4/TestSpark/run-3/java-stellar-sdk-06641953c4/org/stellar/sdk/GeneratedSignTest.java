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

public class GeneratedSignTest {

    @Test
    public void signTest() {
        byte[] data = "Test data".getBytes();
        KeyPair keyPair = KeyPair.random();
        byte[] signature = keyPair.sign(data);
        assertNotNull(signature);
    }

}