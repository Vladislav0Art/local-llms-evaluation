package org.stellar.sdk;

import com.google.common.base.Preconditions;
import org.junit.jupiter.api.Test;

public class GeneratedTestFromSecretSeed {

    @Test
    public void testFromSecretSeed() {
        char[] secretSeed = "secret seed".toCharArray();
        Preconditions.checkArgument(KeyPair.fromSecretSeed(secretSeed) != null, "Expected non-null key pair");
    }

}