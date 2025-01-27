package com.sun.tools.xjc.addon.xew;

public class GeneratedRunInternal_RunInternalPlugin {

    @Test
    public void runInternal_RunInternalPlugin() throws Exception {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        GeneratedTest.Outline outline = new GeneratedTest.Outline();
        plugin.runInternal(outline);
        assertTrue(plugin.hasXmlElementWrapperAnnotation());
        assertEquals(1, outline.getCopyFieldCount());
        assertTrue(plugin.isListedAsParametrisation(outline));
        assertEquals(1, outline.getCopyMemberCount());
    }
}

public class Outline {
    private int copyFieldCount = 0;
    private int copyMemberCount = 0;

    public int getCopyFieldCount() {
        return copyFieldCount;
    }

    public void setCopyFieldCount(int copyFieldCount) {
        this.copyFieldCount = copyFieldCount;
    }

    public int getCopyMemberCount() {
        return copyMemberCount;
    }

    public void setCopyMemberCount(int copyMemberCount) {
        this.copyMemberCount = copyMemberCount;
    }
}

public class XmlElementWrapperPlugin {
    private boolean hasXmlElementWrapperAnnotation = false;

    public boolean hasXmlElementWrapperAnnotation() {
        return hasXmlElementWrapperAnnotation;
    }

    public void runInternal(Outline outline) {
        // Add logic for test
        this.hasXmlElementWrapperAnnotation = true;
    }

    public boolean isListedAsParametrisation(Outline outline) {
        // Add logic for test
        return false;
    }

}