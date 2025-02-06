package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetAccountIdIsNonEmptyString {

    @Test
    public void getAccountIdIsNonEmptyString() {
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.generate());
        assertNot null (keyPair.getAccountId());
        assertTrue(!keyPair.getAccountId().isEmpty());
    }

}