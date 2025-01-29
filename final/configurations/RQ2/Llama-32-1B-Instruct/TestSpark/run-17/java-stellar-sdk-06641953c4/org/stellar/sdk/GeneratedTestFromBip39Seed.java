package org.stellar.sdk;

import com.google.common.base.Preconditions;
import org.junit.jupiter.api.Test;

public class GeneratedTestFromBip39Seed {

    @Test
    public void testFromBip39Seed() {
        byte[] bip39Seed = "bip39 seed".getBytes();
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed);
        Preconditions.checkArgument(keyPair.getPublicKey() != null, "Expected non-null public key");
    }

}