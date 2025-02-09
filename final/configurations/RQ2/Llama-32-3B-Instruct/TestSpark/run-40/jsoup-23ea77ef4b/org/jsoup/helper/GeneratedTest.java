package org.jsoup.helper;

public class GeneratedTest {

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
    public void testContextNode() {
        Node result = w3cDom.contextNode(wDoc);
        assertThat(result, is(wDoc));
    }
}

public class W3CDomSourceNodesTest {
    private W3CDom wDoc;
    private W3CDom sourceNodes;

    @Before
    public void setUp() throws Exception {
        wDoc = new W3CDom();
        sourceNodes = new W3CDom();
    }

    @Test
    public void testSourceNodes() {
        List<Node> result = w3cDom.sourceNodes(sourceNodes, Node.class);
        assertThat(result.size(), is(1));
        assertThat(result.get(0), is(wDoc));
    }
}

public class W3CDomNamespaceAwareTest {
    private W3CDom wDoc;
    private boolean expectedNamespaceAware;

    @Before
    public void setUp() throws Exception {
        wDoc = new W3CDom();
        expectedNamespaceAware = true;
    }

    @Test
    public void testNamespaceAware() {
        boolean result = w3cDom.namespaceAware(expectedNamespaceAware);
        assertThat(result, is(expectedNamespaceAware));
    }
}

public class W3CDomTest {
    private W3CDom wDoc;

    @Before
    public void setUp() throws Exception {
        wDoc = new W3CDom();
    }

    @Test
    public void testParse() {
        Document result = wDoc.parse("<html><body>Hello World</body></html>");
        assertThat(result, is(wDoc));
    }

}