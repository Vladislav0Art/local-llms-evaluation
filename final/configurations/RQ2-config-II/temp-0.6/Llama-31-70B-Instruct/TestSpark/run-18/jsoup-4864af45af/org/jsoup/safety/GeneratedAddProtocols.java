package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class GeneratedAddProtocols {

    private final String tag;
    private final String attribute;
    private final String[] protocols;
    private final boolean expected;

    public SafelistTest(String tag, String attribute, String[] protocols, boolean expected) {
        this.tag = tag;
        this.attribute = attribute;
        this.protocols = protocols;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"a", "href", new String[]{"http"}, true},
                {"a", "href", new String[]{"https"}, true},
                {"a", "href", new String[]{"ftp"}, false},
                {"img", "src", new String[]{"http"}, true},
                {"img", "src", new String[]{"https"}, true},
                {"img", "src", new String[]{"ftp"}, false},
        });
    }

    @Test
    public void addProtocols() {
        Safelist safelist = new Safelist();
        safelist.addProtocols(tag, attribute, protocols);
        assertEquals(expected, safelist.isSafeAttribute(tag, null, new Attribute(attribute, "")));
    }

}