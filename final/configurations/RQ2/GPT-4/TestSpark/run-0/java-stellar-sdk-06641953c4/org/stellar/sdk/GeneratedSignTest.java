package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedSignTest {

    @Test
    public void signTest() throws GeneralSecurityException {
        String seed = "seed";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed.getBytes());
        byte[] data = "data".getBytes();
        keyPair.sign(data);
    }

}