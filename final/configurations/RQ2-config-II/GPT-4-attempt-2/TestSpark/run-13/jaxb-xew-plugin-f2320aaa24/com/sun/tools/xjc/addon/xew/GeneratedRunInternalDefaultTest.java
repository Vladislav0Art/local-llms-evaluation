package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import com.sun.tools.xjc.model.CElementPropertyInfo;
import com.sun.tools.xjc.model.CPropertyInfo;
import com.sun.tools.xjc.outline.Outline;
import com.sun.xml.xsom.XSComponent;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedRunInternalDefaultTest {

    @Test
    public void runInternalDefaultTest() throws ClassNotFoundException, IOException {
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        Outline outline = mock(Outline.class);

        xmlElementWrapperPlugin.runInternal(outline);

        Assert.assertTrue(true);
    }

}