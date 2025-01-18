package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.DecoratedSignature;

import java.nio.charset.StandardCharsets;

public class GeneratedFromSecretSeedUsingStringTest {

    @Test
    public void fromSecretSeedUsingStringTest() {
        String seed = "SAZJ3FQFZFSM5HNPBWTHX7R6SDBKINKWZXK3HXHX5CU37VFL23SCZQQZ";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(keyPair);
    }

}