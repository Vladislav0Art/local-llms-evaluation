package com.crowdin.client.core.http.impl.json;

import com.crowdin.api.client.core.http.impl.json.JacksonJsonTransformerImpl;
import org.junit.Test;

public class GeneratedTestGetPropertyAccessor {

    @Test
    public void testGetPropertyAccessor() {
        PropertyAccessor propertyAccessor = new JacksonJsonTransformerImpl();
        assertEquals("John", propertyAccessor.getPropertyValue("name"));
        assertEquals(30, ((Number) propertyAccessor.getPropertyValue("age")).intValue());
        assertTrue(propertyAccessor.getPropertyValue("isAdmin").equals(true));
    }

}