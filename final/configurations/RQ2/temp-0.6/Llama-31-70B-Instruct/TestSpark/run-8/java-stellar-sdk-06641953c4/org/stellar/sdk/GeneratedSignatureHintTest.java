package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import static org.junit.Assert.*;

public class GeneratedSignatureHintTest {

    @Test
    public void signatureHintTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed("secretSeed");
        assertEquals(keyPair.getSignatureHint(), SignatureHint.fromBytes(new byte[]{0, 1, 2, 3}));
    }

}