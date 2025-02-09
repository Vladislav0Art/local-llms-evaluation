package org.stellar.sdk;

import com.google.common.base.Charsets;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromSecretSeedCharArrayTest {

    @Test
    public void fromSecretSeedCharArrayTest() {
        String seed = "S5EDGEDVHFXOYASZGIVRGI5RHFPBLQF7XHGBMHZIDO24MBPIXMYHUQL7";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed.toCharArray());

        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

}