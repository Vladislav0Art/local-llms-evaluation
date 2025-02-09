package org.jsoup.helper;

public class GeneratedTestParse {

    // ... existing fields and methods ...
}

public class W3CDomContextNodeTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private W3CDom wDoc;
    private W3CDom sourceNodes;

    @Before
    public void setUp() throws Exception {
        wDoc = new W3CDom();
        sourceNodes = new W3CDom();
    }

    @Test
    public void testParse() {
        Document result = wDoc.parse("<html><body>Hello World</body></html>");
        assertThat(result, is(wDoc));
    }

}