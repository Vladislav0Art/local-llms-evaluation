package org.jsoup.parser;

public class GeneratedTestInsertNodeWithAttributes {

    private Document document;
    private StringBuilder xmlNodeList = new StringBuilder();
    private List<Node> expectedXmlNodeList;

    @Test
    public void TestInsertNodeWithAttributes() throws Exception {
        String inputString = "<a attr='value'>text</a>";
        List<Node> expectedNodes = new ArrayList<>();
        expectedNodes.add(new AttrNode("attr", "value", 0, false));
        expectedNodes.add(new TagNode("<a>", 10, 0, true));
        expectedNodes.add(new TextNode("text", 11));
        xmlNodeList.append(expectedNodes.toString());
    }

}