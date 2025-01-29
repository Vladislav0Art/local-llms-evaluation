package org.stellar.sdk;

import com.google.common.base.Preconditions;
import org.junit.jupiter.api.Test;

public class GeneratedTestSign {

    @Test
    public void testSign() {
        String data = "some data";
        byte[] signature = KeyPair.sign(data);
        Preconditions.checkArgument(signature != null, "Expected non-null signature");
    }

}