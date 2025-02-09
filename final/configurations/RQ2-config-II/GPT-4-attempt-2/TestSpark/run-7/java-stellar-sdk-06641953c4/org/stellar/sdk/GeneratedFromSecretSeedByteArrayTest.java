package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveTable;
import net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.Uint256;

import java.io.IOException;
import java.security.interfaces.ECPublicKey;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeedByteArrayTest {

    @Test
    public void fromSecretSeedByteArrayTest() {
        byte[] seed = {1, 2, 3, 4};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}