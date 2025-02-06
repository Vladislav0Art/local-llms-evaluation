package org.jsoup.nodes;

public class GeneratedClone_BasicTest {

    @Test
    public void clone_BasicTest() {
        TextNode original = new TextNode("test");
        TextNode clone = original.clone();
        assertNotNull(clone);
        assertEquals("test", clone.text());
    }

}