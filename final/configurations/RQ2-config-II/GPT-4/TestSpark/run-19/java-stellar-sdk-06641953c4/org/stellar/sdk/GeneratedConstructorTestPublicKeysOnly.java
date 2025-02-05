package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.KeyPairGenerator;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConstructorTestPublicKeysOnly {

    @Test
    public void constructorTestPublicKeysOnly() throws GeneralSecurityException {
        EdDSAPublicKey edDSAPublicKey = new EdDSAPublicKey(new EdDSAPrivateKey().getSpec());
        KeyPair keyPair = new KeyPair(edDSAPublicKey);
        assertNotNull(keyPair);
        assertFalse(keyPair.canSign());
    }

}