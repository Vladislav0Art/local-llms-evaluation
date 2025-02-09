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

public class GeneratedRunInternalWithSchemaOutputResolver {

    @Test
    public void runInternalWithSchemaOutputResolver() throws IOException, SAXException, ClassNotFoundException {
        JCodeModel codeModel = new JCodeModel();
        JPackage jPackage = codeModel._package("");
        Assert.assertNotNull(jPackage);

        CodeWriter codeWriter = null;
        SchemaOutputResolver schemaOutputResolver = null;
        Outline context = new ModelLoader("", new Navigator[0], null, null, false, false, codeWriter, schemaOutputResolver).generateCode(codeModel, codeWriter);
        Ring.add(context);

        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        try {
            plugin.runInternal(context);
            Assert.fail("Exception expected");
        } catch (ClassNotFoundException e) {
            // Expected
        }
    }

}