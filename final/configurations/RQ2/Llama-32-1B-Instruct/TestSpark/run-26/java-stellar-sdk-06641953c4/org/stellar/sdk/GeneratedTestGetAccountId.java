package org.stellar.sdk;

import com.google.common.baseObjects.ObjectOf;
import org.junit.Test;

import static org.junit.Assert.*;

import java.security.KeyPair;

public class GeneratedTestGetAccountId {

    @Test
    public void testGetAccountId() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey().generateBip39Seed("seed1"));
        assertEquals("random seed", keyPair.getAccountId(), Objects.toString(keyPair.getAccountId()));
    }

}