package org.jsoup.parser;

public class GeneratedNewInstance_ReturnsNewInstance {

    @Test
    public void newInstance_ReturnsNewInstance() {
        XmlTreeBuilder builder1 = new XmlTreeBuilder();
        XmlTreeBuilder builder2 = builder1.newInstance();
        assertNotSame(builder1, builder2);
    }

}