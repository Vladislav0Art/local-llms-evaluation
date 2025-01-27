package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;

import java.security.GeneralSecurityException;

public class GeneratedGetAccountId_test {

    @Test
    public void getAccountId_test() {
        KeyPair keyPair = new KeyPair();
        assertNull(keyPair.getAccountId());
    }

}