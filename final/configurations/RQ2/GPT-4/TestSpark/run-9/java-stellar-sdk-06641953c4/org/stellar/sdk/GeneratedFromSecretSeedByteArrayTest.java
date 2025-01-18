package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.util.Arrays;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromSecretSeedByteArrayTest {

    private final char[] testData = new char[]{'t', 'e', 's', 't', 'D', 'a', 't', 'a'};
    private final String testString = "testData";
    private final byte[] testBytes = testString.getBytes();

    @Test
    public void fromSecretSeedByteArrayTest() {
        KeyPair kp = KeyPair.fromSecretSeed(testBytes);
        Assert.assertNotNull(kp);
    }

}