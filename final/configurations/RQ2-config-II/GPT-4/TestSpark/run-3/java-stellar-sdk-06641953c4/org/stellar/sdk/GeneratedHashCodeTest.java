package org.stellar.sdk;

import org.hamcrest.core.IsEqual;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed("TESTSEED".getBytes());
        int hashCode = keyPair.hashCode();
        assertThat(hashCode, IsEqual.equalTo(keyPair.hashCode()));
    }

}