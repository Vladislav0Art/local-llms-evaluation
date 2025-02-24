package org.stellar.sdk;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedGetXdrSignerKeyTest {

    @Test
    public void getXdrSignerKeyTest() {
        KeyPair keyPair = new KeyPair(/* some public key */);
        assertEquals(new SignerKey(/* expected xdr signer key */), keyPair.getXdrSignerKey());
    }

}