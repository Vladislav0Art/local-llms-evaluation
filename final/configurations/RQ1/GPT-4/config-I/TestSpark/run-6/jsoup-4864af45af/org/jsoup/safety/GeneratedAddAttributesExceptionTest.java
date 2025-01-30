package org.jsoup.safety;

import org.jdom2.IllegalDataException;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedAddAttributesExceptionTest {

    @Test
    public void addAttributesExceptionTest() {
        Safelist safelist = Safelist.none();
        safelist.addAttributes("a", null);
    }

}