package org.jsoup.parser;

public class GeneratedClone_CloneTagReturnsNewCloneObject {

    @Test
    public void clone_CloneTagReturnsNewCloneObject() {
        Tag original = new Tag();
        Tag clone = original.clone();
        assertNotNull(clone);
        assertNotSame(original, clone);
    }

}