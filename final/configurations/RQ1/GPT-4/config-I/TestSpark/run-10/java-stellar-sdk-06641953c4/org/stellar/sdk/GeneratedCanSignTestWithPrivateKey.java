package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedCanSignTestWithPrivateKey {

    @Test
    public void canSignTestWithPrivateKey() {
        KeyPair keyPair = KeyPair.fromSecretSeed("SCZANGBA5YHTNYVVV4C3U252E2B6P6F5T3U6MM63WBSBZATAQI3EBTQ4");
        assertTrue(keyPair.canSign());
    }

}