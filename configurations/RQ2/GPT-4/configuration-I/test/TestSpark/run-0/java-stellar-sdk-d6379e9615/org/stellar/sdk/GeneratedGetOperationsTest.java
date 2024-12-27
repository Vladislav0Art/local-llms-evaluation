package org.stellar.sdk;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.*;

public class GeneratedGetOperationsTest {

    // Example values for constructing Transaction
    private final static KeyPair sourceAccount = KeyPair.random();
    private final static Network NETWORK = Network.TESTNET;
    private final static long FEE = 100;
    private final static long SEQUENCE_NUMBER = 0;
    private final static Operation[] OPERATIONS = new Operation[0];
    private final static Memo MEMO = Memo.none();
    private final static long TIMEOUT = 10;

    @Test
    public void getOperationsTest() {
        Operation operation = new CreateAccountOperation.Builder(sourceAccount.getAccountId(), "10.0").build();
        Transaction transaction = createDefaultTransactionBuilder().addOperation(operation).build();
        assertEquals(transaction.getOperations().length, 1);
        assertEquals(transaction.getOperations()[0], operation);
    }

}