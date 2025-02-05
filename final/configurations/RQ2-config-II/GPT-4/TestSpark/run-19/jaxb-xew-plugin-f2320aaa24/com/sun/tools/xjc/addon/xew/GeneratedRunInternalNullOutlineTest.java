package com.sun.tools.xjc.addon.xew;

import java.io.IOException;

import com.sun.tools.xjc.addon.xew.CommonUtils;
import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import com.sun.tools.xjc.model.CCustomizations;
import com.sun.tools.xjc.outline.Outline;
import com.sun.xml.xsom.XSComponent;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class GeneratedRunInternalNullOutlineTest {

    @Test
    public void runInternalNullOutlineTest() throws ClassNotFoundException, IOException {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        plugin.runInternal(null);
    }

}