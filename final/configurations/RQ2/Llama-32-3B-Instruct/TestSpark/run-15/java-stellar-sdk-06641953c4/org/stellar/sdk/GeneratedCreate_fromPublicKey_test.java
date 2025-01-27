package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;

import java.security.GeneralSecurityException;

public class GeneratedCreate_fromPublicKey_test {

    @Test
    public void create_fromPublicKey_test() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey();
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey.getEncoded());
        assertNotNull(keyPair);
    }

}