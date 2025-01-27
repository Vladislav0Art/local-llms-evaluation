package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedGetAccountId WorksWhenKeyIsGenerated {

    @Test
    public void getAccountId

    WorksWhenKeyIsGenerated() {
        KeyPair keyPair = KeyPair.random();
        assertEquals(keyPair.getAccountId(), keyPair.getXdrPublicKey().getAccountId());
    }

}