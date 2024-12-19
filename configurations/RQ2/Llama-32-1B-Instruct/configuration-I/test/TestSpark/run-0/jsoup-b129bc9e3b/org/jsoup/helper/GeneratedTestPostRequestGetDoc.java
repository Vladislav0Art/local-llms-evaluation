package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPostRequestGetDoc {

    public String toString() {
        // implement document generation logic here
        return "";
    }
}

public class GeneratedTest {

    @Test
    public void testPostRequestGetDoc() throws Exception {
        Request request = new PostRequest(new Document());
        assertEquals("hello world", (String) request.doc().toString(), 0);
    }

}