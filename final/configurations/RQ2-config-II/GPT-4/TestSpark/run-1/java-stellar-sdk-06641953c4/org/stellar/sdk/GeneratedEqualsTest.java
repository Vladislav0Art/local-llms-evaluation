package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.SignerKeyType;

import static org.junit.Assert.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        KeyPair keyPair1 = KeyPair.fromSecretSeed("SGUZP5NW");
        KeyPair keyPair2 = KeyPair.fromSecretSeed("SGUZP5NW");
        assertEquals(keyPair1, keyPair2);
    }

}