package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.stellar.sdk.KeyPair;

public class GeneratedGetXdrPublicKey_returnsXdrPublicKey {

    @Test
    public void getXdrPublicKey_returnsXdrPublicKey() {
        PublicKey publicKey = PublicKey.fromXdrPublicKey("publicKey");
        KeyPair keyPair = KeyPair.fromXdrPublicKey(publicKey);
        assertNotNull(keyPair.getXdrPublicKey());
    }

}