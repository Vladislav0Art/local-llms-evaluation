package org.jsoup.nodes;

public class GeneratedTestParseComment {

    @Before
    public void setup() {
        Jsoup.parse(System.getProperty("user.dir"));
    }

    @Test
    public void testParseComment() throws Exception {
        Document doc = Jsoup.parse("/* Comment */", null);
        String commentText = doc.toString();
        System.out.println(commentText);
        assertEquals("comment", commentText);
    }

}