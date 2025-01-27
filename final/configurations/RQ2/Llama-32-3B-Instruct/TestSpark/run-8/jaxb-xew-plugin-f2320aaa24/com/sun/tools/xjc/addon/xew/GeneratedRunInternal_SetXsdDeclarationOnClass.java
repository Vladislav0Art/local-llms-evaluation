package com.sun.tools.xjc.addon.xew;

public class GeneratedRunInternal_SetXsdDeclarationOnClass {

    public Outline createOutline() {
        // implementation
        return new Outline();
    }

    @Test
    public void runInternal_SetXsdDeclarationOnClass() throws IOException {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        Outline outline = this.createOutline();
        plugin.runInternal(outline);
        assertTrue(plugin.hasXsdDeclaration(outline));
    }

}