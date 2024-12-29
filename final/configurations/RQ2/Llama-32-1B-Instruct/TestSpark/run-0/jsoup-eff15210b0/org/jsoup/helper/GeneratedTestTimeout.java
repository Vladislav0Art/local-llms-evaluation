package org.jsoup.helper;

public class GeneratedTestTimeout {

    @Test
    public void testTimeout() throws IOException, InterruptedException {
        MockHttpConnection connection = new MockHttpConnection();
        assertEquals(0, connection.timeout(100), 1);
        Thread.sleep(101);
        assertEquals(100, connection.timeout(100), 1);
    }

}