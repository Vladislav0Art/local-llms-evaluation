package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import net.i2p.crypto.eddsa.*;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeedNullByteArrayTest {

    @Test
    public void fromSecretSeedNullByteArrayTest() {
        KeyPair.fromSecretSeed((byte[]) null);
    }

}