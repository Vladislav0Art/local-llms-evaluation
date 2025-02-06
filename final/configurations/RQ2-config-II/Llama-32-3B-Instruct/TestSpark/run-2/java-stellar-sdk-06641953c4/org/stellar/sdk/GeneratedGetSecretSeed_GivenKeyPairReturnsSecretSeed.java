package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.Signature;
import java.util.Arrays;

public class GeneratedGetSecretSeed_GivenKeyPairReturnsSecretSeed {

    @Test
    public void getSecretSeed_GivenKeyPairReturnsSecretSeed() throws IOException, GeneralSecurityException {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey("seed".getBytes()));
        byte[] secretSeed = keyPair.getSecretSeed();
        assertNotNull(secretSeed);
    }

}