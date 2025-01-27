package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;

public class GeneratedIsSafeAttributeTagNameNull_AttributesNull_SafeAttributes {

    @Test
    public void isSafeAttributeTagNameNull_AttributesNull_SafeAttributes() {
        Safelist none = Safelist.none();
        Attributes attributes = new Attributes();
        assertFalse(none.isSafeAttribute(null, null, new Attribute()));
    }

}