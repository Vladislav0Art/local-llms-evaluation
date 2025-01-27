package com.sun.tools.xjc.addon.xew;

public class GeneratedRunInternal_CopiesAnnotatedClassMembers {

    public Outline createOutline() {
        // implementation
        return new Outline();
    }

    @Test
    public void runInternal_CopiesAnnotatedClassMembers() throws IOException {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        Outline outline = this.createOutline();
        plugin.runInternal(outline);
        assertEquals(1, outline.getCopyMemberCount());
    }

    private class Outline {
        // implementation
    }

}