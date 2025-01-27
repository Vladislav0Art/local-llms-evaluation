package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class GeneratedTest {

    @Test
    public void none_SafelistIsNone() {
        Safelist safelist = Safelist.none();
        Validate.isTrue(safelist.isSafeTag("tag"));
    }

    @Test
    public void simpleText_IsSimpleText() {
        Safelist safelist = Safelist.simpleText();
        Validate.isTrue(safelist.isSafeTag("text"));
    }

    @Test
    public void basic_IsBasic() {
        Safelist safelist = Safelist.basic();
        Validate.isTrue(safelist.isSafeTag("tag"));
    }

    @Test
    public void basicWithImages_IsBasicWithImages() {
        Safelist safelist = Safelist.basicWithImages();
        Validate.isTrue(safelist.isSafeTag("img"));
    }

    @Test
    public void relaxed_IsRelaxed() {
        Safelist safelist = Safelist.relaxed();
        Validate.isTrue(safelist.isSafeTag("script"));
    }

    @Test
    public void none_addTags_SafelistIsNoneAfterAddingTags() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addTags("tag");
        Validate.isTrue(safelist.isSafeTag("tag"));
    }

    @Test
    public void basic_removeTags_SafelistBecomesBasicAfterRemovingTags() {
        Safelist safelist = Safelist.basic();
        safelist = Safelist.removeTags("tag");
        Validate.isTrue(safelist.isSafeTag("img"));
    }

    @Test
    public void none_addAttributes_SafelistIsNoneAfterAddingAttributes() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addAttributes("tag", "attribute");
        Validate.isTrue(safelist.isSafeAttribute("tag", null, null));
    }

    @Test
    public void basic_removeAttributes_SafelistBecomesBasicAfterRemovingAttributes() {
        Safelist safelist = Safelist.basic();
        safelist = Safelist.removeAttributes("tag", "attribute");
        Validate.isTrue(safelist.isSafeTag("img"));
    }

    @Test
    public void none_addEnforcedAttribute_SafelistIsNoneAfterAddingEnforcedAttribute() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addEnforcedAttribute("tag", "attribute", "value");
        Validate.isTrue(safelist.isSafeAttribute("tag", null, null));
    }

    @Test
    public void basic_removeEnforcedAttribute_SafelistBecomesBasicAfterRemovingEnforcedAttribute() {
        Safelist safelist = Safelist.basic();
        safelist = Safelist.removeEnforcedAttribute("tag", "attribute");
        Validate.isTrue(safelist.isSafeTag("img"));
    }

    @Test
    public void none_preserveRelativeLinks_SafelistIsNoneAfterPreservingRelativeLinks() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.preserveRelativeLinks(true);
        Validate.isTrue(safelist.isSafeAttribute(null, null, null));
    }

    @Test
    public void basic_addProtocols_SafelistBecomesBasicAfterAddingProtocols() {
        Safelist safelist = Safelist.basic();
        safelist = Safelist.addProtocols("tag", "attribute", "protocol");
        Validate.isTrue(safelist.isSafeAttribute("tag", null, null));
    }

    @Test
    public void none_removeProtocols_SafelistIsNoneAfterRemovingProtocols() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.removeProtocols("tag", "attribute", "removeProtocol");
        Validate.isTrue(safelist.isSafeAttribute(null, null, null));
    }

    @Test
    public void simpleText_getEnforcedAttributes_IsSimpleText() {
        Safelist safelist = Safelist.simpleText();
        Set<String> enforcedAttributes = new HashSet<>(safelist.getEnforcedAttributes("text"));
        Validate.isTrue(enforcedAttributes.contains("text"));
    }

}