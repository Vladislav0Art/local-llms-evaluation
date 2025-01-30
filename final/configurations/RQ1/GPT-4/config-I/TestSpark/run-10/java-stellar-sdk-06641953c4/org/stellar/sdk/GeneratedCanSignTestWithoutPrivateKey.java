package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedCanSignTestWithoutPrivateKey {

    @Test
    public void canSignTestWithoutPrivateKey() {
        KeyPair keyPair = KeyPair.fromAccountId("GD5T6IPRNCKFOHQWTJ3OOHYXDSM7GJN7K3E3Y6RMZ44ZJ2JT4ZT5YJPA");
        assertFalse(keyPair.canSign());
    }

}