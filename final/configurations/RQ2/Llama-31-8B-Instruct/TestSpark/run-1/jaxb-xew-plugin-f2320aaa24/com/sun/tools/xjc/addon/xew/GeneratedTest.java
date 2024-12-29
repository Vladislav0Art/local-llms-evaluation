package com.sun.tools.xjc.addon.xew;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private XmlElementWrapperPlugin plugin;

    @Test
    public void runInternal_NoConfig_NoException() {
        Outline outline = new Outline();
        plugin.runInternal(outline);
        assertNotNull(outline);
    }

    @Test
    public void runInternal_ConfigurationProvided_NoException() {
        ClassConfiguration config = new ClassConfiguration();
        Outline outline = new Outline();
        plugin.runInternal(outline);
        assertNotNull(outline);
    }

    @Test
    public void runInternal_NullOutline_ThrowsNullPointerException() {
        try {
            plugin.runInternal(null);
            assertTrue(false);
        } catch (NullPointerException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void runInternal_EmptyOutline_NoException() {
        Outline outline = new Outline();
        outline.setClasses(new ArrayList<>());
        plugin.runInternal(outline);
        assertNotNull(outline);
    }

    @Test
    public void runInternal_ClassOutline_NoException() {
        ClassOutline classOutline = new ClassOutline();
        Outline outline = new Outline();
        outline.setClasses(singletonList(classOutline));
        plugin.runInternal(outline);
        assertNotNull(classOutline);
    }

    @Test
    public void runInternal_FieldOutline_NoException() {
        FieldOutline fieldOutline = new FieldOutline();
        Outline outline = new Outline();
        outline.setFields(singletonList(fieldOutline));
        plugin.runInternal(outline);
        assertNotNull(fieldOutline);
    }

    @Test
    public void runInternal_Ring_NoException() {
        Ring ring = new Ring();
        Outline outline = new Outline();
        outline.setRing(ring);
        plugin.runInternal(outline);
        assertNotNull(ring);
    }

    @Test
    public void runInternal_XSDeclaration_NoException() {
        XSDeclaration xsDeclaration = new XSDeclaration();
        Outline outline = new Outline();
        outline.setXsDeclaration(xsDeclaration);
        plugin.runInternal(outline);
        assertNotNull(xsDeclaration);
    }

    @Test
    public void runInternal_XSComponent_NoException() {
        XSComponent xsComponent = new XSComponent();
        Outline outline = new Outline();
        outline.setXsComponent(xsComponent);
        plugin.runInternal(outline);
        assertNotNull(xsComponent);
    }

}