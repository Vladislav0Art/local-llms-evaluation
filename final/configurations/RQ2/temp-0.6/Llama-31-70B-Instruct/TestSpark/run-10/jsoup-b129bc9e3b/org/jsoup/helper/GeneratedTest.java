package org.jsoup.helper;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private HttpConnection connection;

    @Before
    public void setUp() {
        connection = new HttpConnection();
    }

    @Test
    public void testConnect() throws IOException {
        URL url = new URL("https://www.example.com");

        HttpURLConnection connection = Mockito.mock(HttpURLConnection.class);
        Mockito.when(connection.getResponseCode()).thenReturn(200);
        Mockito.when(connection.getInputStream()).thenReturn(new ByteArrayInputStream("test".getBytes()));

        Response response = connection.execute();
        assertEquals(200, response.statusCode());
        assertEquals("test", response.body());
    }

    @Test
    public void testGet() throws IOException {
        URL url = new URL("https://www.example.com");

        HttpURLConnection connection = Mockito.mock(HttpURLConnection.class);
        Mockito.when(connection.getResponseCode()).thenReturn(200);
        Mockito.when(connection.getInputStream()).thenReturn(new ByteArrayInputStream("test".getBytes()));

        Document doc = connection.get();
        assertEquals("test", doc.text());
    }

    @Test
    public void testPost() throws IOException {
        URL url = new URL("https://www.example.com");

        HttpURLConnection connection = Mockito.mock(HttpURLConnection.class);
        Mockito.when(connection.getResponseCode()).thenReturn(200);
        Mockito.when(connection.getInputStream()).thenReturn(new ByteArrayInputStream("test".getBytes()));

        Document doc = connection.post();
        assertEquals("test", doc.text());
    }

}