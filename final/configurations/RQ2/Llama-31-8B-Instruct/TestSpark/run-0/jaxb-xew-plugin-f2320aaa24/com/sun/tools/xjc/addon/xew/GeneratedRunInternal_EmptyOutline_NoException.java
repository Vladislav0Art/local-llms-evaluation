package com.sun.tools.xjc.addon.xew;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInternal_EmptyOutline_NoException {

    @InjectMocks
    private XmlElementWrapperPlugin plugin;

    @Test
    public void runInternal_EmptyOutline_NoException() {
        Outline outline = new Outline();
        outline.setClasses(new ArrayList<>());
        plugin.runInternal(outline);
        assertNotNull(outline);
    }

}