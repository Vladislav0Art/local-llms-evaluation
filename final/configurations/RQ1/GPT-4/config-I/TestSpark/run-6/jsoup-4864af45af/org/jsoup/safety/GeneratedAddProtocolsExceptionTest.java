package org.jsoup.safety;

import org.jdom2.IllegalDataException;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedAddProtocolsExceptionTest {

    @Test
    public void addProtocolsExceptionTest() {
        Safelist safelist = Safelist.none();
        safelist.addProtocols("a", "href", null);
    }

}