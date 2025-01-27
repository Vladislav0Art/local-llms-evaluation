package com.sun.tools.xjc.addon.xew;

public class GeneratedRunInternal_AddsParametrizationForListedElements {

    public Outline createOutline() {
        // implementation
        return new Outline();
    }

    @Test
    public void runInternal_AddsParametrizationForListedElements() throws IOException {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        Outline outline = this.createOutline();
        plugin.runInternal(outline);
        assertTrue(plugin.isListedAsParametrisation(outline));
    }

}