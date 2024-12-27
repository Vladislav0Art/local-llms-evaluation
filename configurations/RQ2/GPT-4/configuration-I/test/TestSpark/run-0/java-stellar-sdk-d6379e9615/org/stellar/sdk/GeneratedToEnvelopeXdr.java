package org.stellar.sdk;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.*;

public class GeneratedToEnvelopeXdr {

    @Test
    public void toEnvelopeXdr() {
        Transaction transaction = new Transaction();
        TransactionEnvelope transactionEnvelope = transaction.toEnvelopeXdr();
        assertNotNull(transactionEnvelope);
    }

}