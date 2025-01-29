package org.jsoup.parser;

public class GeneratedTestSetSelfClosing {

    @Before
    public void setup() {
    }

    @Test
    public void testSetSelfClosing() {
        Tag tag1 = new Tag();
        tag1.setSelfClosing(true);
        assertTrue(tag1.isSelfClosing());
    }

}