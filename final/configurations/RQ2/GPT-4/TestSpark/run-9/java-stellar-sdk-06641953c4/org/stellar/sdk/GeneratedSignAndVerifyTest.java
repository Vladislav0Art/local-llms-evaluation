package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.util.Arrays;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSignAndVerifyTest {

    private final char[] testData = new char[]{'t', 'e', 's', 't', 'D', 'a', 't', 'a'};
    private final String testString = "testData";
    private final byte[] testBytes = testString.getBytes();

    @Test
    public void signAndVerifyTest() {
        KeyPair kp = KeyPair.random();
        byte[] signature = kp.sign(testBytes);
        Assert.assertTrue(kp.verify(testBytes, signature));
    }

}