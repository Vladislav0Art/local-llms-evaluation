package com.crowdin.client.core.http.impl.json;

import com.crowdin.api.client.core.http.impl.json.JacksonJsonTransformerImpl;
import org.junit.Test;

public class GeneratedTestGetBoolean {

    @Test
    public void testGetBoolean() {
        boolean bool = new JacksonJsonTransformerImpl().transformJson(true);
        assertEquals(bool, false);
    }

}