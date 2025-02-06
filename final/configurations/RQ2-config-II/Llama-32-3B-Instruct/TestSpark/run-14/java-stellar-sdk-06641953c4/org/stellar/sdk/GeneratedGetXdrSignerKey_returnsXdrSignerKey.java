package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.stellar.sdk.KeyPair;

public class GeneratedGetXdrSignerKey_returnsXdrSignerKey {

    @Test
    public void getXdrSignerKey_returnsXdrSignerKey() {
        SignerKey signerKey = SignerKey.fromXdrSignerKey("signerKey");
        KeyPair keyPair = KeyPair.fromXdrSignerKey(signerKey);
        assertNotNull(keyPair.getXdrSignerKey());
    }

}