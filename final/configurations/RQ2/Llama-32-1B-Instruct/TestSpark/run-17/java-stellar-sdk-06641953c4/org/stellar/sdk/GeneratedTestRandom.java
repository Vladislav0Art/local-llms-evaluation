package org.stellar.sdk;

import com.google.common.base.Preconditions;
import org.junit.jupiter.api.Test;

public class GeneratedTestRandom {

    @Test
    public void testRandom() {
        KeyPair keyPair = KeyPair.random();
        Preconditions.checkArgument(keyPair.getAccountId() != null, "Expected non-null account id");
    }

}