package org.stellar.sdk;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.*;

public class GeneratedGetSequenceNumberTest {

    // Example values for constructing Transaction
    private final static KeyPair sourceAccount = KeyPair.random();
    private final static Network NETWORK = Network.TESTNET;
    private final static long FEE = 100;
    private final static long SEQUENCE_NUMBER = 0;
    private final static Operation[] OPERATIONS = new Operation[0];
    private final static Memo MEMO = Memo.none();
    private final static long TIMEOUT = 10;

    @Test
    public void getSequenceNumberTest() {
        Transaction transaction = createDefaultTransactionBuilder().build();
        assertEquals(transaction.getSequenceNumber(), SEQUENCE_NUMBER);
    }

}