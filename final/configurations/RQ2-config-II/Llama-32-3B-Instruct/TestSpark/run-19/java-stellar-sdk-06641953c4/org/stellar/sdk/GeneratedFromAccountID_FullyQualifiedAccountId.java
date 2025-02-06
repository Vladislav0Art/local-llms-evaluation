package org.stellar.sdk;

import org.stellar.sdk.KeyPair;
import org.junit.Test;

import static org.junit.Assert.*;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromAccountID_FullyQualifiedAccountId {

    @Test
    public void fromAccountID_FullyQualifiedAccountId() {
        String accountId = "X-ACCOUNT-ID";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair.getPublicKey());
    }

}