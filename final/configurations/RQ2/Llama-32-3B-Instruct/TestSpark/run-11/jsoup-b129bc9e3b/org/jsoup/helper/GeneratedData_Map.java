package org.jsoup.helper;

public class GeneratedData_Map {

    @Test
    public void data_Map() {
        Map<String, String> data = Collections.singletonMap("key", "value");
        assertSame(HttpConnection.class, Connection.data(data).getClass());
    }

}