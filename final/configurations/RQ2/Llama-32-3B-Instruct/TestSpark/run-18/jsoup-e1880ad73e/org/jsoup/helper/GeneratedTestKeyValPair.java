package org.jsoup.helper;

public class GeneratedTestKeyValPair {

    @Rule
    public TestRule rule = new JUnit4TestRule() {
        @Override
        protected void startTestRule(TestDescriptor test) throws Exception {
            System.setProperty("jsoup.debug", "true");
        }
    };

    private Connection connection;

    @Before
    public void setupConnection() {
        connection = new Connection();
        connection.setScheme("https");
        connection.setHost("example.com");
    }

    @Test
    public void testKeyValPair() {
        KeyVal kv = new KeyVal(connection.getKey(), connection.getValue());
        when(connection.getKey()).thenReturn(kv.getKey());
        when(connection.getValue()).thenReturn(kv.getValue());

        assertTrue(StringUtil.isEncodedKvPair(kv.getKey(), kv.getValue()));
    }

}