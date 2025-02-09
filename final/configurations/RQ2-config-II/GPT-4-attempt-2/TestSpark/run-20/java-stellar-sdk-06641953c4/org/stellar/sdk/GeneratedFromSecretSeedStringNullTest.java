package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeedStringNullTest {

    @Test
    public void fromSecretSeedStringNullTest() {
        KeyPair.fromSecretSeed((String) null);
    }

}