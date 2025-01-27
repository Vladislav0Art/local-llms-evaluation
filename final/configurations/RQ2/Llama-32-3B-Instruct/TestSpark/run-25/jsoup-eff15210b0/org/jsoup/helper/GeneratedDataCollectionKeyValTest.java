package org.jsoup.helper;

public class GeneratedDataCollectionKeyValTest {

    @Test
    public void dataCollectionKeyValTest() {
        Collection<Connection.Request> keyVals = Arrays.asList(new Connection.Request(), new Connection.Request());
        Connection connection = HttpConnection.connect("https://example.com");
        Connection data = connection.data(keyVals);
        assertNotNull(data);
    }

}