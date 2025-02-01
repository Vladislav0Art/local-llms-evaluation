package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.GeneralSecurityException;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedFromAccountIdTest {

    @Test
    public void fromAccountIdTest() {
        String accountId = "GBC3SG6NGTSZ2OMH3FFGB7UVRQWILW367U4GSOOF4TFSZONV42UJXUH7";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
    }

}