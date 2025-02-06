package org.stellar.sdk;

import org.stellar.sdk.KeyPair;
import org.junit.Test;

import static org.junit.Assert.*;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromAccountID_PartiallyQualifiedAccountId {

    @Test
    public void fromAccountID_PartiallyQualifiedAccountId() {
        String accountId = "X-ACCOUNT";
        assertThrows(GeneralSecurityException.class, () -> KeyPair.fromAccountId(accountId));
    }

}