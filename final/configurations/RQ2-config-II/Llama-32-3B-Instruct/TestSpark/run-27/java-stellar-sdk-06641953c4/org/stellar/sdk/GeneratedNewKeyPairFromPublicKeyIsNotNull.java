package org.stellar.sdk;

import net.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

import static com.google.common.base.Preconditions.checkNotNull;
import static java.lang.System.arraycopy;

public class GeneratedNewKeyPairFromPublicKeyIsNotNull {

    @Test
    public void newKeyPairFromPublicKeyIsNotNull() {
        byte[] publicKey = {1, 2, 3};
        assertTrue(KeyPair.fromPublicKey(publicKey) != null);
    }

}