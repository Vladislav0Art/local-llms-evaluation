package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Safelist mockSafelist;

    @Test
    public void noneTest() {
        Safelist none = Safelist.none();
        assertNotNull(none);
    }

    @Test
    public void simpleTextTest() {
        Safelist simpleText = Safelist.simpleText();
        assertNotNull(simpleText);
    }

    @Test
    public void basicTest() {
        Safelist basic = Safelist.basic();
        assertNotNull(basic);
    }

    @Test
    public void basicWithImagesTest() {
        Safelist basicWithImages = Safelist.basicWithImages();
        assertNotNull(basicWithImages);
    }

    @Test
    public void relaxedTest() {
        Safelist relaxed = Safelist.relaxed();
        assertNotNull(relaxed);
    }

    @Test
    public void constructorTest() {
        Safelist safelist = new Safelist();
        assertNotNull(safelist);
    }

    @Test
    public void copyConstructorTest() {
        Safelist safelist = new Safelist(mockSafelist);
        assertNotNull(safelist);
    }

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        String[] tags = {"div", "span"};
        safelist.addTags(tags);
        assertNotNull(safelist);
    }

}