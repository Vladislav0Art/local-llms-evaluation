package com.sun.tools.xjc.addon.xew;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInternal_XSDeclaration_NoException {

    @InjectMocks
    private XmlElementWrapperPlugin plugin;

    @Test
    public void runInternal_XSDeclaration_NoException() {
        XSDeclaration xsDeclaration = new XSDeclaration();
        Outline outline = new Outline();
        outline.setXsDeclaration(xsDeclaration);
        plugin.runInternal(outline);
        assertNotNull(xsDeclaration);
    }

}