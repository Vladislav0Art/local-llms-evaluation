package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import net.i2p.crypto.eddsa.*;
import org.stellar.sdk.xdr.*;
import com.google.common.io.BaseEncoding;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromBip39SeedTest {

    @Test
    public void fromBip39SeedTest() {
        byte[] seed = BaseEncoding.base16().lowerCase().decode("000102030405060708090a0b0c0d0e0f");
        KeyPair keyPair = KeyPair.fromBip39Seed(seed, 0);
        assertNotNull(keyPair);
    }

}