package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.util.Arrays;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromXdrPublicKeyTest {

    private final char[] testData = new char[]{'t', 'e', 's', 't', 'D', 'a', 't', 'a'};
    private final String testString = "testData";
    private final byte[] testBytes = testString.getBytes();

    @Test
    public void fromXdrPublicKeyTest() {
        KeyPair kp1 = KeyPair.random();
        PublicKey pk = kp1.getXdrPublicKey();
        KeyPair kp2 = KeyPair.fromXdrPublicKey(pk);
        Assert.assertEquals(kp1, kp2);
    }

}