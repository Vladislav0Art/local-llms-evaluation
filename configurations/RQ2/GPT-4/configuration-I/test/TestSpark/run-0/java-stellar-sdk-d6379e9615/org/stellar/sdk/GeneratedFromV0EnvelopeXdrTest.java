package org.stellar.sdk;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.*;

public class GeneratedFromV0EnvelopeXdrTest {

    @Test
    public void fromV0EnvelopeXdrTest() {
        TransactionV0Envelope transactionV0Envelope = Mockito.mock(TransactionV0Envelope.class);
        Network network = Mockito.mock(Network.class);
        AccountConverter accountConverter = Mockito.mock(AccountConverter.class);
        assertNotNull(Transaction.fromV0EnvelopeXdr(accountConverter, transactionV0Envelope, network));
    }

}