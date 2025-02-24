package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestFromAccountId {

    @Test
    public void testFromAccountId() {
        KeyPair keyPair = KeyPair.fromAccountId("accountId");
        assertNotNull(keyPair);
    }

}