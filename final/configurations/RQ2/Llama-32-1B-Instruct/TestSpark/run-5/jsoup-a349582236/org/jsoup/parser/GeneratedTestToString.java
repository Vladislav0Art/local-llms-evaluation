package org.jsoup.parser;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        String[] tags = {"img", "div"};
        Tag tag1 = new Tag("img");
        Tag tag2 = new TagImpl("img");

        assertEquals(tag1.toString(), tag2.toString());
    }

}