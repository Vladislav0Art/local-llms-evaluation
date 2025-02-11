package org.jsoup.parser;

public class GeneratedDefaultSettingsReturnsPreserveCase {

    private XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

    @Test
    public void defaultSettingsReturnsPreserveCase() {
        Assert.assertEquals(ParseSettings.preserveCase, xmlTreeBuilder.defaultSettings());
    }

}