package org.stellar.sdk;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.*;

public class GeneratedSetEnvelopeTypeTest {

    @Test
    public void setEnvelopeTypeTest() {
        Transaction transaction = new Transaction();
        transaction.setEnvelopeType(EnvelopeType.ENVELOPE_TYPE_TX_V0);
        assertEquals(transaction.getEnvelopeType(), EnvelopeType.ENVELOPE_TYPE_TX_V0);
    }

}