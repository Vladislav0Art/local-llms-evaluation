package org.stellar.sdk;

import net.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

import static com.google.common.base.Preconditions.checkNotNull;
import static java.lang.System.arraycopy;

public class GeneratedFromSecretSeedIsNotNullWhenInputIsNotNull {

    @Test
    public void fromSecretSeedIsNotNullWhenInputIsNotNull() {
        char[] seed = {0x00, 0x01, 0x02, 0x03};
        assertTrue(KeyPair.fromSecretSeed(seed) != null);
    }

}