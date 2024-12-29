package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class GeneratedAsStringTest_returnsCorrectOutput {

    @Test
    public void asStringTest_returnsCorrectOutput() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        StringWriter writer = new StringWriter();
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        transformer.transform(new DOMSource(doc), new StreamResult(writer));
        String result = W3CDom.asString(doc, null);
        assertEquals(METHOD, writer.toString());
    }

}