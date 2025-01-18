package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.SignerKeyType;

import static org.junit.Assert.*;

public class GeneratedFromPublicKeyBytesTest {

    @Test
    public void fromPublicKeyBytesTest() {
        byte[] publicKey = {1, 2, 3, 4, 5};
        assertNotNull(KeyPair.fromPublicKey(publicKey));
    }

}