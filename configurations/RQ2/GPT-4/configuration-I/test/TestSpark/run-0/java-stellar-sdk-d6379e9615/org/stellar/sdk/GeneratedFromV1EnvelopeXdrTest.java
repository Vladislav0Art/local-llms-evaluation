package org.stellar.sdk;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.*;

public class GeneratedFromV1EnvelopeXdrTest {

    @Test
    public void fromV1EnvelopeXdrTest() {
        TransactionV1Envelope transactionV1Envelope = Mockito.mock(TransactionV1Envelope.class);
        Network network = Mockito.mock(Network.class);
        AccountConverter accountConverter = Mockito.mock(AccountConverter.class);
        assertNotNull(Transaction.fromV1EnvelopeXdr(accountConverter, transactionV1Envelope, network));
    }

}