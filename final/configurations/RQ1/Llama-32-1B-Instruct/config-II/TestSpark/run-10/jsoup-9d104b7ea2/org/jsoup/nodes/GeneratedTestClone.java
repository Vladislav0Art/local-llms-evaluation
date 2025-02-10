package org.jsoup.nodes;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        TextNode node = new TextNode("Hello");
        String cloneText = node.clone().text();
        assertTrue(cloneText.contains("Hello"));
    }

    private String getInnerText(Document document, Appendable accum) {
        for (int i = 0; i < document.bodyNodes().size(); i++) {
            Node child = document.bodyNodes().get(i);
            appendStringToAccum(accum, child.toString());
        }
        return String.valueOf(accum.toString());
    }

    private void appendStringToAccum(Appendable accum, String str) {
        if (str.length() > 0) {
            accum.append(str.charAt(0));
            for (char c : str.substring(1).toCharArray()) {
                appendStringToAccum(accum, String.valueOf(c));
            }
        }
    }

}