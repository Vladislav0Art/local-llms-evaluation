package org.stellar.sdk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;

import org.junit.Test;
import org.stellar.sdk.AccountID;
import org.stellar.sdk.KeyPair;
import org.stellar.sdk.Network;
import org.stellar.sdk.Transaction;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.SignatureHint;

public class GeneratedTest {

    @Test
    public void fromAccountIdTest() {
        KeyPair keyPair = KeyPair.fromAccountId("GA4NS7M4LPOXDJRFZOA6QB3V2ZRBUGL5D5D5E2RZ2GEBK7SZR2P43W3J5");
        assertEquals(keyPair.getAccountId(), "GA4NS7M4LPOXDJRFZOA6QB3V2ZRBUGL5D5D5E2RZ2GEBK7SZR2P43W3J5");
        assertEquals(keyPair.getPublicKey(), "GDQNY3PBOJOKYZSRMK2S7LHHGWZIUISD4QORETLMXEWXBI7KFZZMKTL3");
    }

}