package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedFromJsoupElementTest {

    @Test
    public void fromJsoupElementTest() throws Exception {
        org.jsoup.nodes.Element element = soup.selectFirst("div");
        Document wDoc = W3CDom.fromJsoup(element);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.transform(new DOMSource(wDoc), new StreamResult(outContent));
        String output = outContent.toString();
        assertTrue(output.contains("<div></div>"));
    }

}