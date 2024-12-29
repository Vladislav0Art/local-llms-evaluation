package org.stellar.sdk;

import org.stellar.sdk.KeyPair;
import org.stellar.sdk.PublicKey;
import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedGetAccountId_givenKeyPair_returnAccountId {

    @Test
    public void getAccountId_givenKeyPair_returnAccountId() {
        String accountId = "abc123";
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromBytes(new byte[]{1, 2, 3}));
        assertEquals(accountId, keyPair.getAccountId());
    }

}