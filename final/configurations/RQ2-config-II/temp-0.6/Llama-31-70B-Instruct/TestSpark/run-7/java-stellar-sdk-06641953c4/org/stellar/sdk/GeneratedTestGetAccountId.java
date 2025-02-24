package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetAccountId {

    @Test
    public void testGetAccountId() {
        KeyPair keyPair = new KeyPair(null);
        assertEquals("", keyPair.getAccountId());
    }

}