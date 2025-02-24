package org.stellar.sdk;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedGetSignatureHintTest {

    @Test
    public void getSignatureHintTest() {
        KeyPair keyPair = new KeyPair(/* some public key */);
        assertEquals(new SignatureHint(/* expected signature hint */), keyPair.getSignatureHint());
    }

}