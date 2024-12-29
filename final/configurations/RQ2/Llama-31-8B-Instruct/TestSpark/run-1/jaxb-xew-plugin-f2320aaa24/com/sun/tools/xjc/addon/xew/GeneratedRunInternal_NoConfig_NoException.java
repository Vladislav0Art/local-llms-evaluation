package com.sun.tools.xjc.addon.xew;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInternal_NoConfig_NoException {

    @InjectMocks
    private XmlElementWrapperPlugin plugin;

    @Test
    public void runInternal_NoConfig_NoException() {
        Outline outline = new Outline();
        plugin.runInternal(outline);
        assertNotNull(outline);
    }

}