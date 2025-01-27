package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedCreateMethodShouldReturnEmptyListIfNoPropertiesAdded {

    @Mock
    private Property<?> property1, property2, property3;

    @Mock
    private Map<String, Object> map1, map2;

    @Test
    public void createMethodShouldReturnEmptyListIfNoPropertiesAdded() {
        // given
        PropertyListBuilder builder = new PropertyListBuilder();

        // when
        List<Property<?>> actualProperties = new ArrayList<>(builder.create());
        // then
        assertThat(actualProperties, is(new ArrayList<>()));
    }

}