package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedGetAccountIdTest {

    private static final String SECRET_SEED = "SCZANGBA5YHTNYVVV4C3U252E2B6P6F5T3U6MM63WBSBZATAQI3EBTQ4";
    private static final String ACCOUNT_ID = "GAYOLLLUIZE4DZMBB2ZBKGBPGIMYN6E6O74IQZJCDL7E6RSGIUNAC6Y4";

    @Test
    public void getAccountIdTest() {
        KeyPair keyPair = KeyPair.fromAccountId(ACCOUNT_ID);
        assertEquals(keyPair.getAccountId(), ACCOUNT_ID);
    }

}