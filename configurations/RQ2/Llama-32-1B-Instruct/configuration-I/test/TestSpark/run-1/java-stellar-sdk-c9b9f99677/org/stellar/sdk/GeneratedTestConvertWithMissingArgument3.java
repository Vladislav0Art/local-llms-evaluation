package org.stellar.sdk;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import okhttp3.HttpUrl;

public class GeneratedTestConvertWithMissingArgument3 {

    private static final AccountConverter<String, Long> accountConverter = new AccountConverter<>();

    @Test
    public void testConvertWithMissingArgument3() throws Exception {
        Transaction transaction = null;
        Map<String, Long> data = new HashMap<>();
        SendTransactionResponse response;
        try {
            response = (SendTransactionResponse) accountConverter.convert(data);
            fail(response.message);
        } catch (PrepareTransactionException e) {
            throw new RuntimeException(e);
        }
    }

}