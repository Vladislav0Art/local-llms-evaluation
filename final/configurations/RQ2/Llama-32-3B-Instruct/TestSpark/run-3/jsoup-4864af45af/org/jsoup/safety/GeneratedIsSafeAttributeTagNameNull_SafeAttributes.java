package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

public class GeneratedIsSafeAttributeTagNameNull_SafeAttributes {

    @Test
    public void isSafeAttributeTagNameNull_SafeAttributes() {
        Safelist none = Safelist.none();
        Attributes attributes = new Attributes();
        assertFalse(none.isSafeAttribute(null, null, new Attribute()));
    }

}