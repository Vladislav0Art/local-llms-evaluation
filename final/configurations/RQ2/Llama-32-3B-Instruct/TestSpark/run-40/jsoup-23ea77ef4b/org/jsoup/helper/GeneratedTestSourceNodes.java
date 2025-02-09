package org.jsoup.helper;

public class GeneratedTestSourceNodes {

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

}