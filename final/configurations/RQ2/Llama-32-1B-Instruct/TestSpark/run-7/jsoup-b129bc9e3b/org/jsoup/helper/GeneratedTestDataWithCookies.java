package org.jsoup.helper;

public class GeneratedTestDataWithCookies {

    @Test
    public void testDataWithCookies() {
        HttpConnection connection = new HttpConnection();
        Collection<Connection.KeyVal> data = new ArrayList<>();
        data.add(new Connection.KeyVal("key1", "value1"));
        connection.data(data);
        assertEquals(3, connection.getCookieManager().getCookieCount());
    }

}