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
public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        KeyPair keyPair1 = KeyPair.fromSecretSeed("S5EDGEDVHFXOYASZGIVRGI5RHFPBLQF7XHGBMHZIDO24MBPIXMYHUQL7");
        KeyPair keyPair2 = KeyPair.fromSecretSeed("S5EDGEDVHFXOYASZGIVRGI5RHFPBLQF7XHGBMHZIDO24MBPIXMYHUQL7");

        assertEquals(keyPair1.hashCode(), keyPair2.hashCode());
    }

}