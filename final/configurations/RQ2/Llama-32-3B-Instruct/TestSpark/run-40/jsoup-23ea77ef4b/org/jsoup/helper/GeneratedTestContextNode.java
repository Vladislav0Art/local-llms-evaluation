package org.jsoup.helper;

public class GeneratedTestContextNode {

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

}