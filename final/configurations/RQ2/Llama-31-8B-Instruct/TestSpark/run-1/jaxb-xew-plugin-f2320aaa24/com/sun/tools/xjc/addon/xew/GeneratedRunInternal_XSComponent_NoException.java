package com.sun.tools.xjc.addon.xew;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInternal_XSComponent_NoException {

    @InjectMocks
    private XmlElementWrapperPlugin plugin;

    @Test
    public void runInternal_XSComponent_NoException() {
        XSComponent xsComponent = new XSComponent();
        Outline outline = new Outline();
        outline.setXsComponent(xsComponent);
        plugin.runInternal(outline);
        assertNotNull(xsComponent);
    }

}