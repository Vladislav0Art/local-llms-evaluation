package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.KeyPairGenerator;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedFrom_PublicKeyTest_ValueLessThan32 {

    @Test
    public void from_PublicKeyTest_ValueLessThan32() {
        KeyPair.fromPublicKey(new byte[20]);
    }

}