package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.spec.EdDSAPrivateKeySpec;
import net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.SignerKeyType;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeedStringTest {

    @Test
    public void fromSecretSeedStringTest() {
        KeyPair pair = KeyPair.fromSecretSeed("SBR25NMQRKQ4LRB5CFI23BNBZSJ4GMEGWGJEWO4SXCHQTCO6OH5A7K5P");
        assertNotNull(pair);
    }

}