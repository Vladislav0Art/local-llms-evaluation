package org.jsoup.parser;

public class GeneratedTest {

    private Document document;
    private StringBuilder xmlNodeList = new StringBuilder();
    private List<Node> expectedXmlNodeList;

    @Test
    public void TestParseDoc() throws Exception {
        document = parseReader("input.xml", "http://example.com");
        assertXmlNodeListLength(5);
    }

    @Test
    public void TestParseFragment() throws Exception {
        String inputFragment = "<fragment>text</fragment>";
        List<Node> expectedNodes = new ArrayList<>();
        expectedNodes.add(new TagNode("<fragment>", 0));
        expectedNodes.add(new AttrNode("data", "test", 1, false), 2);
        expectedNodes.add(new TextNode("text", 3));
        xmlNodeList.append(expectedNodes.toString());
    }

    @Test
    public void TestInsertNode() throws Exception {
        document.insert(0, new TagNode("<a>", 10, 0, true));
        assertXmlNodeListLength(1);
        verifyInsertion(10, null);
    }

    private void assertXmlNodeListLength(int length) {
        String xmlOutput = document.toString();
        if (xmlOutput.contains("<node>")) {
            expectedXmlNodeList = new ArrayList<>(Arrays.asList(new TagNode[]{
                    new AttrNode("<a>", 0, false, true),
                    new TextNode("text", 1),
                    new Node[]{}
            }));
        } else {
            expectedXmlNodeList = null;
        }
        assertEquals(length, expectedXmlNodeList.length());
    }

    @Test
    public void TestInsertNodeWithAttributes() throws Exception {
        String inputString = "<a attr='value'>text</a>";
        List<Node> expectedNodes = new ArrayList<>();
        expectedNodes.add(new AttrNode("attr", "value", 0, false));
        expectedNodes.add(new TagNode("<a>", 10, 0, true));
        expectedNodes.add(new TextNode("text", 11));
        xmlNodeList.append(expectedNodes.toString());
    }

    @Test
    public void TestInsertMultipleNodes() throws Exception {
        String inputString = "<a>text</a><b>content</b>";
        List<Node> expectedNodes = new ArrayList<>();
        expectedNodes.add(new TagNode("<a>", 0, true));
        expectedNodes.add(new AttrNode("attr", "value", 1, false));
        expectedNodes.add(new TagNode("<b>", 10, false));
        expectedNodes.add(new TextNode("content", 11));
        xmlNodeList.append(expectedNodes.toString());
    }

    @Test
    public void TestPopStackToClose() throws Exception {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        document.insert(0, new TagNode("<a>", 10, 0, true));
        assertXmlNodeListLength(1);
        verifyInsertion(10, "a");
    }

    private void verifyInsertion(int index, String node) {
        if (index < xmlNodeList.length()) {
            Node nodeToVerify = xmlNodeList.charAt(index).trim();
            assertEquals(node, nodeToVerify);
        } else {
            fail("Unexpected node found at index %d", index);
        }
    }

    @Test
    public void TestProcessToken() throws Exception {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        document.insert(0, new TagNode("<a>", 10, 0, true));
        assertXmlNodeListLength(1);
        treeBuilder.process(new Token("token"));
        verifyInsertion(10, "token");
    }

    @Test
    public void TestInsertCommentToken() throws Exception {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        document.insert(0, new TagNode("<a>", 10, 0, true));
        assertXmlNodeListLength(1);
        treeBuilder.process(new Token.Comment("comment"));
        verifyInsertion(10, "comment");
    }

    @Test
    public void TestInsertCharacterToken() throws Exception {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        document.insert(0, new TagNode("<a>", 10, 0, true));
        assertXmlNodeListLength(1);
        treeBuilder.process(new Token.Character("char"));
        verifyInsertion(10, "char");
    }

    @Test
    public void TestInsertDoctypeToken() throws Exception {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        document.insert(0, new TagNode("<a>", 10, 0, true));
        assertXmlNodeListLength(1);
        treeBuilder.process(new Token.Doctype("doctype"));
        verifyInsertion(10, "doctype");
    }

    @Test
    public void TestPopStackToCloseWithToken() throws Exception {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        document.insert(0, new TagNode("<a>", 10, 0, true));
        assertXmlNodeListLength(1);
        treeBuilder.process(new Token.StartTag("start"));
        verifyInsertion(10, "start");
        treeBuilder.popStackToClose(new Token.EndTag("end"));
        verifyInsertion(11, "end");
    }

}