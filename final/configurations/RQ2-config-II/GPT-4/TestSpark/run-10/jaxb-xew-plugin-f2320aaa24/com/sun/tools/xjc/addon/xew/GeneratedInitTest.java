package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.outline.ClassOutline;
import com.sun.tools.xjc.outline.Outline;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.List;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        Options mockOptions = Mockito.mock(Options.class);
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        xmlElementWrapperPlugin.init(mockOptions);
        Assert.assertNotNull("XmlElementWrapperPlugin options should not be null after initialization", xmlElementWrapperPlugin.getOptions());
    }

}