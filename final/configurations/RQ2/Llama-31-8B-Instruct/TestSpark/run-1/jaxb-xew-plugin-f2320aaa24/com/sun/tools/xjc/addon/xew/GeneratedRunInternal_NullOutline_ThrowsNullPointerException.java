package com.sun.tools.xjc.addon.xew;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInternal_NullOutline_ThrowsNullPointerException {

    @InjectMocks
    private XmlElementWrapperPlugin plugin;

    @Test
    public void runInternal_NullOutline_ThrowsNullPointerException() {
        try {
            plugin.runInternal(null);
            assertTrue(false);
        } catch (NullPointerException e) {
            assertNotNull(e);
        }
    }

}