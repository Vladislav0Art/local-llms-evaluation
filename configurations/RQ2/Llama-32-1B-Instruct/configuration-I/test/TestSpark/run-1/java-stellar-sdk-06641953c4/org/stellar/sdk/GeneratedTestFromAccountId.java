package org.stellar.sdk;

import org.stellar.sdk.DecoratedSignature;
import org.stellar.sdk.SignatureHint;
import org.stellar.sdk.SignerKey;
import org.stellar.sdk.XdrPublicKey;
import org.stellar.sdk.XdrSignerKey;

import java.util.Arrays;

public class GeneratedTestFromAccountId {

    @Test
    public void testFromAccountId() {
        String accountId = "123456789012345678901234567890";
        KeyPair key = KeyPair.fromAccountId(accountId);
        assertNotNull(key);
    }

}