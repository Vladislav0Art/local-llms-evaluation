package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;
import org.stellar.sdk.SignatureHint;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

public class GeneratedFromPublicKeyTest {

    @Test
    public void fromPublicKeyTest() {
        KeyPair keyPair = KeyPair.fromPublicKey(new byte[0]);
        assertNotNull(keyPair);
    }

}