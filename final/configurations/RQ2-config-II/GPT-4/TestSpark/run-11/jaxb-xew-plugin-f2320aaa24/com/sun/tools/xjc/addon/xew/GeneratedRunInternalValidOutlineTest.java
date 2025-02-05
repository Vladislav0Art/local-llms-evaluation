package com.sun.tools.xjc.addon.xew;

import org.junit.Test;
import org.mockito.Mockito;
import com.sun.tools.xjc.outline.Outline;

import static org.junit.Assert.assertNotNull;

public class GeneratedRunInternalValidOutlineTest {

    @Test
    public void runInternalValidOutlineTest() throws Exception {
        Outline outline = Mockito.mock(Outline.class);
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        xmlElementWrapperPlugin.runInternal(outline);
        assertNotNull(xmlElementWrapperPlugin);
    }

}