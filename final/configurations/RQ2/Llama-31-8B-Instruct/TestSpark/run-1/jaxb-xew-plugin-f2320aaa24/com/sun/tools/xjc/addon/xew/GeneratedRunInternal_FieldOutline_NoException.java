package com.sun.tools.xjc.addon.xew;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInternal_FieldOutline_NoException {

    @InjectMocks
    private XmlElementWrapperPlugin plugin;

    @Test
    public void runInternal_FieldOutline_NoException() {
        FieldOutline fieldOutline = new FieldOutline();
        Outline outline = new Outline();
        outline.setFields(singletonList(fieldOutline));
        plugin.runInternal(outline);
        assertNotNull(fieldOutline);
    }

}