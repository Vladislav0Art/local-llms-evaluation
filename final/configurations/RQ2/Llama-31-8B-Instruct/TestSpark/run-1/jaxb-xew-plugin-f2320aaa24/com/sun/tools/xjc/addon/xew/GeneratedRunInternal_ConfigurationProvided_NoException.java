package com.sun.tools.xjc.addon.xew;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInternal_ConfigurationProvided_NoException {

    @InjectMocks
    private XmlElementWrapperPlugin plugin;

    @Test
    public void runInternal_ConfigurationProvided_NoException() {
        ClassConfiguration config = new ClassConfiguration();
        Outline outline = new Outline();
        plugin.runInternal(outline);
        assertNotNull(outline);
    }

}