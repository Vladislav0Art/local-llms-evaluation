package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedGetRootEntriesShouldReturnCorrectMap {

    @Mock
    private Property<?> property1, property2, property3;

    @Mock
    private Map<String, Object> map1, map2;

    @Test
    public void getRootEntriesShouldReturnCorrectMap() {
        // given
        Map<String, Object> expectedMap = map1;
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(property1);

        // when
        Map<String, Object> actualMap = builder.getRootEntries();
        // then
        assertThat(actualMap, is(expectedMap));
    }

}