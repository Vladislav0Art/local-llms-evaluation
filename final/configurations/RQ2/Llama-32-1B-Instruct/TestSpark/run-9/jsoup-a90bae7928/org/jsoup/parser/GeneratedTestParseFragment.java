package org.jsoup.parser;

public class GeneratedTestParseFragment {

    private Document document;
    private StringBuilder xmlNodeList = new StringBuilder();
    private List<Node> expectedXmlNodeList;

    @Test
    public void TestParseFragment() throws Exception {
        String inputFragment = "<fragment>text</fragment>";
        List<Node> expectedNodes = new ArrayList<>();
        expectedNodes.add(new TagNode("<fragment>", 0));
        expectedNodes.add(new AttrNode("data", "test", 1, false), 2);
        expectedNodes.add(new TextNode("text", 3));
        xmlNodeList.append(expectedNodes.toString());
    }

}