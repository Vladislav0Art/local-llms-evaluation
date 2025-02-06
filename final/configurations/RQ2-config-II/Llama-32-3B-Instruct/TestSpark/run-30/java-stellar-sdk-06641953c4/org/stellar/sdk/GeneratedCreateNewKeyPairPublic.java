package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.stellar.sdk.KeyPair;

public class GeneratedCreateNewKeyPairPublic {

    @Test
    public void createNewKeyPairPublic() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey();
        KeyPair keyPair = new KeyPair(publicKey);
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

}