package org.stellar.sdk;

import static org.junit.Assert.*;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedFromPublicKeyTest {

    @Test
    public void fromPublicKeyTest() {
        byte[] publicKey = {49, 61, 54, 63, 56, 106, 71, 103, 65};
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotNull(keyPair);
    }

}