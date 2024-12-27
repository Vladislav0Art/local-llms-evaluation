package org.stellar.sdk;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.*;

public class GeneratedGetPreconditionsTest {

    // Example values for constructing Transaction
    private final static Network NETWORK = Network.TESTNET;
    private final static AccountConverter ACCOUNT_CONVERTER = new AccountConverter(NETWORK);
    private final static String SOURCE_ACCOUNT = "GBT4JYGSKU6Z77ES5U7LZUUGOREMQO6OGZJDUYTCQD22U2YH3BXHOBVL";
    private final static long FEE = 100;
    private final static long SEQUENCE_NUMBER = 0;
    private final static Operation[] OPERATIONS = new Operation[0];
    private final static Memo MEMO = Memo.none();
    private final static TransactionPreconditions PRECONDITIONS = null;
    private final static SorobanTransactionData SOROBAN_DATA = null;

    @Test
    public void getPreconditionsTest() {
        Transaction transaction = new Transaction(ACCOUNT_CONVERTER, SOURCE_ACCOUNT, FEE, SEQUENCE_NUMBER, OPERATIONS, MEMO, PRECONDITIONS, SOROBAN_DATA, NETWORK);
        assertEquals(transaction.getPreconditions(), PRECONDITIONS);
    }

}