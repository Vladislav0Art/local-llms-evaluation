package org.stellar.sdk;

import com.google.common.base.Preconditions;
import org.junit.jupiter.api.Test;

public class GeneratedTestFromAccountId {

    @Test
    public void testFromAccountId() {
        String accountId = "account id";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        Preconditions.checkArgument(keyPair.getAccountId() != null, "Expected non-null account id");
    }

}