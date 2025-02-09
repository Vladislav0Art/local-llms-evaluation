package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.model.CPropertyInfo;
import com.sun.tools.xjc.outline.Outline;
import com.sun.tools.xjc.reader.Ring;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestPluginGetterAndSetter {

    @Test
    public void testPluginGetterAndSetter() {
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        String optionName = "testOption";
        xmlElementWrapperPlugin.setOptionName(optionName);
        assertEquals(optionName, xmlElementWrapperPlugin.getOptionName());
    }

}