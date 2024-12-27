package org.stellar.sdk;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;
import org.stellar.sdk.*;
import org.mockito.Mockito;

public class GeneratedEqualsFalseTest {

    @Test
    public void equalsFalseTest() {
        AccountConverter accountConverter = Mockito.mock(AccountConverter.class);
        Operation[] operations = {};
        Memo memo = Memo.none();

        Transaction transaction1 = new Transaction(accountConverter, "abc123", 100L, 1L, operations, memo, null, null, Network.PUBLIC);
        Transaction transaction2 = new Transaction(accountConverter, "xyz456", 200L, 2L, operations, memo, null, null, Network.PUBLIC);

        assertFalse(transaction1.equals(transaction2));
    }

}