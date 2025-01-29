package org.jsoup.nodes;

public class GeneratedTestGetCommentData {

    @Before
    public void setup() {
        Jsoup.parse(System.getProperty("user.dir"));
    }

    @Test
    public void testGetCommentData() throws Exception {
        Document doc = Jsoup.parse("/* Comment */", null);
        String commentData = doc.data();
        System.out.println(commentData);
        assertEquals(doc.toString(), commentData);
    }
}

public class ParseSettings {
    private boolean allowComments;
    private boolean allowSelfClosingTags;

    public ParseSettings(boolean allowComments, boolean allowSelfClosingTags) {
        this.allowComments = allowComments;
        this.allowSelfClosingTags = allowSelfClosingTags;
    }

    @Override
    public String toString() {
        return "ParseSettings{" +
                "allowComments=" + allowComments +
                ", allowSelfClosingTags=" + allowSelfClosingTags +
                '}';
    }
}

public class IsXmlDeclaration {
    public static boolean isXmlDeclaration() throws Exception {
        // implement logic here
        return false;
    }

    @Override
    public String toString() {
        return "IsXmlDeclaration{method=isXmlDeclaration}";
    }
}

public class Comment {
    private String text;

    public Comment(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

}