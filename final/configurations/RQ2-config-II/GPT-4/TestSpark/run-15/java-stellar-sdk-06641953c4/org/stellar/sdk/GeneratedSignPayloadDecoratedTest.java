package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.*;
import org.stellar.sdk.xdr.*;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedSignPayloadDecoratedTest {

    @Test
    public void signPayloadDecoratedTest() {
        KeyPair pair = KeyPair.random();
        byte[] payload = "stellar sdk".getBytes();
        DecoratedSignature decoratedSignature = pair.signPayloadDecorated(payload);
        assertNotNull(decoratedSignature);
        assertTrue(pair.verify(decoratedSignature.getSignature().getSignature()));
    }

}