package com.sun.tools.xjc.addon.xew;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInternal_ClassOutline_NoException {

    @InjectMocks
    private XmlElementWrapperPlugin plugin;

    @Test
    public void runInternal_ClassOutline_NoException() {
        ClassOutline classOutline = new ClassOutline();
        Outline outline = new Outline();
        outline.setClasses(singletonList(classOutline));
        plugin.runInternal(outline);
        assertNotNull(classOutline);
    }

}