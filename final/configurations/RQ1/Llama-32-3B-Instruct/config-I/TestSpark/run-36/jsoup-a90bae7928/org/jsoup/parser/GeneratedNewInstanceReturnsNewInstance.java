package org.jsoup.parser;

public class GeneratedNewInstanceReturnsNewInstance {

    private XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

    @Test
    public void newInstanceReturnsNewInstance() {
        Assert.assertNotSame(xmlTreeBuilder, new XmlTreeBuilder());
    }

}