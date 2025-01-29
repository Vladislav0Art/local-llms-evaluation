package org.stellar.sdk;

import com.google.common.base.Preconditions;
import org.junit.jupiter.api.Test;

public class GeneratedTestRandomAccountId {

    @Test
    public void testRandomAccountId() {
        String accountId = KEYPAIRS[random()].getAccountId();
        Preconditions.checkArgument(accountId != null, "Expected non-null account id");
    }

}