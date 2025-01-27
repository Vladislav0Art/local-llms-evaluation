package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Attributes attributes;

    @Test
    public void none_SafelistReturnsEmpty() {
        Safelist safelist = Safelist.none();
        assertThat(safelist.getTags(), is(new String[0]));
        assertThat(safelist.getAttributeNames(), is(new String[0]));
    }

    @Test
    public void simpleText_SafelistContainsOnlyTextTags() {
        Safelist safelist = Safelist.simpleText();
        assertThat(safelist.getTags(), is(new String[]{"p", "span"}));
    }

    @Test
    public void basic_SafelistContainsBasicTextAndImageTags() {
        Safelist safelist = Safelist.basic();
        assertThat(safelist.getTags(), is(new String[]{"img", "br", "hr", "p", "div"}));
    }

    @Test
    public void basicWithImages_SafelistContainsBasicTagsWithImageAttributes() {
        Safelist safelist = Safelist.basicWithImages();
        when(attributes.getAttributeNames()).thenReturn(new String[]{"src"});
        assertThat(safelist.getTags(), is(new String[]{"img", "br", "hr", "p", "div"}));
    }

    @Test
    public void relaxed_SafelistContainsAllBasicTagsAndMore() {
        Safelist safelist = Safelist.relaxed();
        assertThat(safelist.getTags(), is(new String[]{"img", "br", "hr", "p", "div", "a", "ul", "ol"}));
    }

    @Test
    public void none_addTags_SafelistReturnsEmpty() {
        Safelist safelist = Safelist.none();
        safelist.addTags("newTag");
        assertThat(safelist.getTags(), is(new String[]{"newTag"}));
    }

    @Test
    public void basic_addTags_SafelistContainsBasicTagsWithNewTags() {
        Safelist safelist = Safelist.basic();
        safelist.addTags("newTag");
        assertThat(safelist.getTags(), is(new String[]{"img", "br", "hr", "p", "div", "a"}));
    }

    @Test
    public void simpleText_removeTags_SafelistDoesNotContainRemovedTags() {
        Safelist safelist = Safelist.simpleText();
        safelist.removeTags("removedTag");
        assertThat(safelist.getTags(), is(new String[]{"p", "span"}));
    }

    @Test
    public void basic_removeTags_SafelistDoesNotContainRemovedTags() {
        Safelist safelist = Safelist.basic();
        safelist.removeTags("removedTag");
        assertThat(safelist.getTags(), is(new String[]{"img", "br", "hr", "p"}));
    }

    @Test
    public void basic_addAttributes_SafelistContainsBasicTagsWithNewAttributes() {
        Safelist safelist = Safelist.basic();
        safelist.addAttributes("newTag", "newValue");
        when(attributes.getAttributeNames()).thenReturn(new String[]{"src"});
        assertThat(safelist.getAttributeNames(), is(new String[]{"src"}));
    }

    @Test
    public void basic_removeAttributes_SafelistDoesNotContainRemovedTags() {
        Safelist safelist = Safelist.basic();
        safelist.removeAttributes("newTag", "newValue");
        assertThat(safelist.getAttributeNames(), is(new String[]{"src"}));
    }

    @Test
    public void none_addEnforcedAttribute_SafelistContainsNewEnforcedAttribute() {
        Safelist safelist = Safelist.none();
        safelist.addEnforcedAttribute("tag", "attribute", "value");
        assertThat(safelist.getEnforcedAttributes("tag"), is(new String[]{"value"}));
    }

    @Test
    public void basic_removeEnforcedAttribute_SafelistDoesNotContainRemovedEnforcedAttribute() {
        Safelist safelist = Safelist.basic();
        safelist.removeEnforcedAttribute("tag", "attribute");
        assertThat(safelist.getEnforcedAttributes("tag"), is(new String[0]));
    }

    @Test
    public void basic_preserveRelativeLinks_SafelistDoesNotPreserveLinks() {
        Safelist safelist = Safelist.basic();
        safelist.preserveRelativeLinks(false);
        assertThat(safelist.isRelativeLink(true), is(false));
    }

}