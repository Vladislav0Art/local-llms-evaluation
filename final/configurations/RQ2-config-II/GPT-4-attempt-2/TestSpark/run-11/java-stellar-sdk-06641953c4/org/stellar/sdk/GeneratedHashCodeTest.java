package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.SignerKeyType;
import org.stellar.sdk.xdr.XdrDataOutputStream;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        KeyPair keyPair = KeyPair.random();
        int hashBefore = keyPair.hashCode();
        int hashAfter = keyPair.hashCode();
        Assert.assertEquals(hashBefore, hashAfter);
    }

}