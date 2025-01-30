package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedConvertHttpBadRequestExceptionTest {

    private final JacksonJsonTransformer underTest = new JacksonJsonTransformer();

    private final Random rand = new Random();

    @Test
    public void convertHttpBadRequestExceptionTest() throws Exception {
        HttpBadRequestException exception = new HttpBadRequestException();

        String result = underTest.convert(exception);

        assertNotEquals("{}", result.replaceAll("\\s", ""));
    }

}