package org.stellar.sdk;

import com.google.common.base.Preconditions;
import org.junit.Test;

public class GeneratedTestGetPublicKey {

    @Test
    public void testGetPublicKey() {
        Preconditions.checkArgument(true);
        String data = "your_public_data_here";
        EdDSAPublicKey publicKey = fromXdrPublicKey(new XdrData(data));
        Preconditions.checkArgument(Objects.equals( public,publicKey));
    }

}