package org.stellar.sdk;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.*;

public class GeneratedSignatureBaseTest {

    @Test
    public void signatureBaseTest() {
        Transaction transaction = new Transaction();
        byte[] signatureBase = transaction.signatureBase();
        assertNotNull(signatureBase);
    }

}