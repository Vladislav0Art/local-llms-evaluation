package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.DecoratedSignature;

import java.nio.charset.StandardCharsets;

public class GeneratedFromSecretSeedUsingCharArrayTest {

    @Test
    public void fromSecretSeedUsingCharArrayTest() {
        String seedString = "SAZJ3FQFZFSM5HNPBWTHX7R6SDBKINKWZXK3HXHX5CU37VFL23SCZQQZ";
        char[] seed = seedString.toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(keyPair);
    }

}