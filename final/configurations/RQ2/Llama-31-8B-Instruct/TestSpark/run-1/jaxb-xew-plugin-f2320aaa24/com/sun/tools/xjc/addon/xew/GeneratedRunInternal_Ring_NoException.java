package com.sun.tools.xjc.addon.xew;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInternal_Ring_NoException {

    @InjectMocks
    private XmlElementWrapperPlugin plugin;

    @Test
    public void runInternal_Ring_NoException() {
        Ring ring = new Ring();
        Outline outline = new Outline();
        outline.setRing(ring);
        plugin.runInternal(outline);
        assertNotNull(ring);
    }

}