package org.jsoup.helper;

public class GeneratedTestDataWithInputStream {

    @Test
    public void testDataWithInputStream() {
        MockHttpConnection mock = new MockHttpConnection();
        InputStream actual = mock.dataAsInputStream("Hello World!");
        assertEquals(actual, mock);
    }
}

class Request {
}

class Response {
}

}