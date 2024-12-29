package org.jsoup.helper;

public class GeneratedNewRequestTest {

    @Test
    public void newRequestTest() {
        Connection newReq = HttpConnection.newRequest();
        assertNotNull(newReq);
        assertFalse(newReq.isComplete());
    }

}