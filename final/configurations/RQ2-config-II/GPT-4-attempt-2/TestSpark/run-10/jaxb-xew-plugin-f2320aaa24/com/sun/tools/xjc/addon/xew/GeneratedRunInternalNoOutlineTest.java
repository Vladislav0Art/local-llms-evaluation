package com.sun.tools.xjc.addon.xew;

import com.sun.codemodel.CodeWriter;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JPackage;
import com.sun.tools.xjc.Outline;
import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import com.sun.tools.xjc.model.Model;
import com.sun.tools.xjc.model.nav.Navigator;
import com.sun.tools.xjc.reader.ModelLoader;
import com.sun.tools.xjc.reader.Ring;
import org.junit.Assert;
import org.junit.Test;
import org.xml.sax.SAXException;

import javax.xml.bind.SchemaOutputResolver;
import javax.xml.bind.annotation.XmlRegistry;
import java.io.IOException;

public class GeneratedRunInternalNoOutlineTest {

    @Test
    public void runInternalNoOutlineTest() throws ClassNotFoundException, IOException {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        try {
            plugin.runInternal(null);
            Assert.fail("Expected an exception to be thrown");
        } catch (NullPointerException ex) {
            // Expected
        }
    }

}