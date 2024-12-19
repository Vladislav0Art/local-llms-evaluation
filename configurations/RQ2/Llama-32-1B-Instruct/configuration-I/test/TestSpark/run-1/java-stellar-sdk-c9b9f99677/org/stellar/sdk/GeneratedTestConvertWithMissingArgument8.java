package org.stellar.sdk;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import okhttp3.HttpUrl;

public class GeneratedTestConvertWithMissingArgument8 {

    private static final AccountConverter<String, Long> accountConverter = new AccountConverter<>();

    @Test
    public void testConvertWithMissingArgument8() throws Exception {
        Transaction transaction = null;
        SendTransactionResponse response;
        try {
            response = (SendTransactionResponse) accountConverter.convert(data);
            fail(response.message);
        } catch (PrepareTransactionException e) {
            throw new RuntimeException(e);
        }
    }

}