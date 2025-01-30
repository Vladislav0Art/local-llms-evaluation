package org.jsoup.safety;

import org.jdom2.IllegalDataException;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.none();
        safelist.addAttributes(":all", "attribute1", "attribute2");
        safelist.removeAttributes(":all", "attribute1");
        String html = "<html><head></head><body><a attribute1=\"attr1\" attribute2=\"attr2\"></a></body></html>";
        Document document = Document.createShell("");
        document.append(html);
        Assert.assertFalse(new StringUtil().isBlank(document.toString()));
    }

}