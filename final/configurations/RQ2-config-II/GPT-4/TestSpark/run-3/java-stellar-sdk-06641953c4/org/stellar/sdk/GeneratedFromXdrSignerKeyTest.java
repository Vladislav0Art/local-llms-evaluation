package org.stellar.sdk;

import org.hamcrest.core.IsEqual;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

public class GeneratedFromXdrSignerKeyTest {

    @Test
    public void fromXdrSignerKeyTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed("TESTSEED".getBytes());
        SignerKey signerKey = keyPair.getXdrSignerKey();
        KeyPair fromXdr = KeyPair.fromXdrSignerKey(signerKey);
        assertNotNull(fromXdr);
    }

}