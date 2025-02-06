package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromAccountId_WhenAccountIdIsNotNull_ReturnsExpected {

    @Test
    public void fromAccountId_WhenAccountIdIsNotNull_ReturnsExpected() {
        String accountId = "12345";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
    }

}