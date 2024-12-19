package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestResponseGetCodeAndDoc {

    public String toString() {
        // implement document generation logic here
        return "";
    }
}

public class GeneratedTest {

    @Test
    public void testResponseGetCodeAndDoc() throws Exception {
        Response response = new Response();
        assertEquals(200, response.getCode());
        assertEquals("hello world", response.getDocument().doc().toString(), 0);
    }

}