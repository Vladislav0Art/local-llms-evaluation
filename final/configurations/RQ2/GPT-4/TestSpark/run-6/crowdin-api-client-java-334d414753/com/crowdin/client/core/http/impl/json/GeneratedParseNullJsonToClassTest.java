package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseNullJsonToClassTest {

    @Test
    public void parseNullJsonToClassTest() {
        JacksonJsonTransformer jtf = new JacksonJsonTransformer();

        jtf.parse(null, TestClass.class);
    }

}