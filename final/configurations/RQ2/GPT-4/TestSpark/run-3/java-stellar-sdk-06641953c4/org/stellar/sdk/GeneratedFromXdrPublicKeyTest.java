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

public class GeneratedFromXdrPublicKeyTest {

    @Test
    public void fromXdrPublicKeyTest() {
        PublicKey key = new PublicKey();
        key.setDiscriminant(PublicKeyType.PUBLIC_KEY_TYPE_ED25519);
        Uint256 uint256 = new Uint256();
        uint256.setUint256(ByteBuffer.allocate(32).array());
        key.setEd25519(uint256);
        KeyPair keyPair = KeyPair.fromXdrPublicKey(key);
        assertNotNull(keyPair);
    }

}