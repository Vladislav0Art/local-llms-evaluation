package org.stellar.sdk;

import static org.junit.Assert.*;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedFromXdrSignerKeyTest {

    @Test
    public void fromXdrSignerKeyTest() {
        KeyPair keypair1 = KeyPair.random();
        SignerKey signerKey = keypair1.getXdrSignerKey();
        KeyPair keypair2 = KeyPair.fromXdrSignerKey(signerKey);
        assertEquals(keypair1, keypair2);
    }

}