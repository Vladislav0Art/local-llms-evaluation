package org.jsoup.nodes;

public class GeneratedTestCheckNotNull {

    @Test
    public void testCheckNotNull() {
        Attributes attributes = new Attributes();
        Assert.assertTrue(Attributes.checkNotNull("value"));
        Assert.assertFalse(Attributes.checkNotNull(null));
    }

}