package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.stellar.sdk.KeyPair;

public class GeneratedGetAccountId {

    @Test
    public void getAccountId() {
        String accountId = "test_account_id";
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        keyPair.setAccountId(accountId);
        assertEquals(accountId, keyPair.getAccountId());
    }

}