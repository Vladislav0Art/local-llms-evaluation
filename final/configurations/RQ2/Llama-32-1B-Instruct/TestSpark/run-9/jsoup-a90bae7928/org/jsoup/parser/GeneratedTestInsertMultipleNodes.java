package org.jsoup.parser;

public class GeneratedTestInsertMultipleNodes {

    private Document document;
    private StringBuilder xmlNodeList = new StringBuilder();
    private List<Node> expectedXmlNodeList;

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

}