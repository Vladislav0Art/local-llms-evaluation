package org.stellar.sdk;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;
import org.stellar.sdk.*;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void getSourceAccountTest() {
        AccountConverter accountConverter = Mockito.mock(AccountConverter.class);
        Operation[] operations = {};
        Memo memo = Memo.text("memo text");
        Transaction transaction = new Transaction(accountConverter, "abc123", 100L, 1L, operations, memo, null, null, Network.PUBLIC);

        assertEquals("abc123", transaction.getSourceAccount());
    }

    @Test
    public void getClaimableBalanceIdIndexOutOfBoundsTest() throws IOException {
        AccountConverter accountConverter = Mockito.mock(AccountConverter.class);
        Operation[] operations = {};
        Memo memo = Memo.none();
        Transaction transaction = new Transaction(accountConverter, "abc123", 100L, 1L, operations, memo, null, null, Network.PUBLIC);

        transaction.getClaimableBalanceId(0);
    }

    @Test
    public void equalsTrueTest() {
        AccountConverter accountConverter = Mockito.mock(AccountConverter.class);
        Operation[] operations = {};
        Memo memo = Memo.none();

        Transaction transaction1 = new Transaction(accountConverter, "abc123", 100L, 1L, operations, memo, null, null, Network.PUBLIC);
        Transaction transaction2 = new Transaction(accountConverter, "abc123", 100L, 1L, operations, memo, null, null, Network.PUBLIC);

        assertTrue(transaction1.equals(transaction2));
    }

    @Test
    public void equalsFalseTest() {
        AccountConverter accountConverter = Mockito.mock(AccountConverter.class);
        Operation[] operations = {};
        Memo memo = Memo.none();

        Transaction transaction1 = new Transaction(accountConverter, "abc123", 100L, 1L, operations, memo, null, null, Network.PUBLIC);
        Transaction transaction2 = new Transaction(accountConverter, "xyz456", 200L, 2L, operations, memo, null, null, Network.PUBLIC);

        assertFalse(transaction1.equals(transaction2));
    }

    @Test
    public void hashCodeNotEqualTest() {
        AccountConverter accountConverter = Mockito.mock(AccountConverter.class);
        Operation[] operations = {};
        Memo memo = Memo.none();

        Transaction transaction1 = new Transaction(accountConverter, "abc123", 100L, 1L, operations, memo, null, null, Network.PUBLIC);
        Transaction transaction2 = new Transaction(accountConverter, "xyz456", 200L, 2L, operations, memo, null, null, Network.PUBLIC);

        assertNotEquals(transaction1.hashCode(), transaction2.hashCode());
    }

}