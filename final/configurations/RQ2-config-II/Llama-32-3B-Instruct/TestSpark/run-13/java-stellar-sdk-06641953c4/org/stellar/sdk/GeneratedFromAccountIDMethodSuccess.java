package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFromAccountIDMethodSuccess {

    @Test
    public void fromAccountIDMethodSuccess() {
        String accountId = "testAccountId";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
        assertEquals(accountId, keyPair.getAccountId());
    }

}