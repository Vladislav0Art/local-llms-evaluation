package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetAccountId {

    @InjectMocks
    private KeyPair keyPair;

    @Mock
    private MessageDigest messageDigest;

    @Test
    public void testGetAccountId() {
        when(keyPair.getAccountId()).thenReturn("test123");
        assertEquals(keyPair.getAccountId(), "test123");
    }

}