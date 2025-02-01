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
public class GeneratedFromAccountIdTest {

    @Test
    public void fromAccountIdTest() {
        String accountId = "GDUAHDW4CCKA44OQJAZZY6GIL3VIYU2SXVUVZKV5BQNR2LZYGOL57IZR";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
    }

}