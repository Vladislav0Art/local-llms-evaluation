package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedGetRootEntriesShouldReturnEmptyMapIfNoPropertiesAdded {

    @Mock
    private Property<?> property1, property2, property3;

    @Mock
    private Map<String, Object> map1, map2;

    @Test
    public void getRootEntriesShouldReturnEmptyMapIfNoPropertiesAdded() {
        // given
        PropertyListBuilder builder = new PropertyListBuilder();

        // when
        Map<String, Object> actualMap = builder.getRootEntries();
        // then
        assertThat(actualMap, is(new HashMap<>()));
    }

}