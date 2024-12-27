package org.stellar.sdk;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.*;

public class GeneratedIsSorobanTransactionTest {

    @Test
    public void isSorobanTransactionTest() {
        Transaction transaction = new Transaction();
        boolean isSorobanTransaction = transaction.isSorobanTransaction();
        assertNotNull(isSorobanTransaction);
    }

}