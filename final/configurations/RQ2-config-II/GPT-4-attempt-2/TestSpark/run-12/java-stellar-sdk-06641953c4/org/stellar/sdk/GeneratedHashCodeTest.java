package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        KeyPair keyPair = KeyPair.random();
        int hashCode1 = keyPair.hashCode();
        int hashCode2 = keyPair.hashCode();
        assertEquals(hashCode1, hashCode2);
    }

}