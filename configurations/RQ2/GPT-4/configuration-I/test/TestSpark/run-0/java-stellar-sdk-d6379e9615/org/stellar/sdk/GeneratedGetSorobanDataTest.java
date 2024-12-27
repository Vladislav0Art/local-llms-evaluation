package org.stellar.sdk;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.*;

public class GeneratedGetSorobanDataTest {

    @Test
    public void getSorobanDataTest() {
        Transaction transaction = new Transaction();
        SorobanTransactionData sorobanData = transaction.getSorobanData();
        assertNotNull(sorobanData);
    }

}