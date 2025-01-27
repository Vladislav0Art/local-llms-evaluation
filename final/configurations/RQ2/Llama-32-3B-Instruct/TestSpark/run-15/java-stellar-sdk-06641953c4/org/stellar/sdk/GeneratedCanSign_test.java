package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;

import java.security.GeneralSecurityException;

public class GeneratedCanSign_test {

    @Test
    public void canSign_test() throws GeneralSecurityException {
        EdDSAPrivateKey privateKey = new EdDSAPrivateKey();
        assertFalse(privateKey.canSign());
    }

}