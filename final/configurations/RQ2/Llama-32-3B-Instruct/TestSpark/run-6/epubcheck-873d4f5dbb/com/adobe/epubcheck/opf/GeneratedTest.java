package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedTest {

    private OPFItem context1 = new OPFItem();
    private ValidationContext validationContext1 = new ValidationContext(context1);

    @org.junit.Test
    public void testOpf() {
        when(validationContext1.getOPFItem()).thenReturn(null);
        assertTrue(opfChecker.checkItem(null, opfHandler));

        when(validationContext1.getMediaOverlaysVocab()).thenReturn(new MediaOverlaysVocab());
        when(opfChecker.getPreferredMediaType("application/smil", "path")).thenReturn("blessed audio type");

        OPFItem item = new OPFItem();
        context1.setRole(Roles.FIRST);
        assertTrue(opfChecker.checkSpineItem(item, opfHandler));
    }

    private static class OPFItem {
        public void setRole(Roles role) {
        }
    }

    private enum Roles {FIRST, SECOND}
}

import org.junit.Test;
import static org.mockito.Mockito.when;

public class GeneratedTest {
    private MediaOverlaysVocab context1 = new MediaOverlaysVocab();
    private ValidationContext validationContext1 = new ValidationContext(context1);
    private OPFChecker opfChecker1 = new OPFChecker();

    @Test
    public void testOpf() {
        when(validationContext1.getMediaOverlaysVocab()).thenReturn(context1);
        when(opfChecker1.getPreferredMediaType("application/smil", "path")).thenReturn("blessed audio type");

        context1.setRole(Roles.FIRST);
        assertTrue(opfChecker1.checkItem(null, null));
    }

    private static class MediaOverlaysVocab {
        public void setRole(Roles role) {
        }
    }

    private static class OPFChecker {
        public boolean checkItem(OPFItem opfItem, OPFItem opfItem2) {
            return false;
        }

        public String getPreferredMediaType(String mediaType, String path) {
            return null;
        }
    }

    private static class ValidationContext {
        private OPFItem opfItem;
        private MediaOverlaysVocab mediaOverlaysVocab;

        public ValidationContext(OPFItem opfItem) {
            this.opfItem = opfItem;
        }

        public void setRole(Roles role) {
        }
    }

    private static enum Roles {FIRST, SECOND}
}

@Test
public void testOpf() {
    when(opfChecker1.getPreferredMediaType("application/smil", "path")).thenReturn("blessed audio type");

    assertTrue(opfChecker1.checkMediaOverlaysVocab(null));

    MediaOverlaysVocab mediaOverlaysVocab = new MediaOverlaysVocab();
    when(opfChecker1.getMediaOverlaysVocab()).thenReturn(mediaOverlaysVocab);
    assertTrue(opfChecker1.checkMediaOverlaysVocab(mediaOverlaysVocab));
}

private static class OPFChecker {
    public String getPreferredMediaType(String mediaType, String path) {
        return null;
    }

    public boolean checkMediaOverlaysVocab(MediaOverlaysVocab mediaOverlaysVocab) {
        return false;
    }
}

private static class MediaOverlaysVocab {
    public void setRole(Roles role) {
    }
}

private static enum Roles {
    FIRST, SECOND
}

}