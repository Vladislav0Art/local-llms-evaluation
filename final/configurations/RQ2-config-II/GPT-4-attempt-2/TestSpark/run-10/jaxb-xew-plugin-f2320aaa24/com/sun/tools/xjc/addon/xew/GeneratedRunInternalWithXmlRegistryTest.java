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

public class GeneratedRunInternalWithXmlRegistryTest {

    @Test
    public void runInternalWithXmlRegistryTest() throws ClassNotFoundException, IOException, SAXException {
        Model model = ModelLoader.create("", new Navigator[0], null, null, false, false, null, null);
        Ring.add(model);
        Outline context = model.generateCode(null, null);
        model.rootClass.addAnnotation(XmlRegistry.class);
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        plugin.runInternal(context);
    }

}