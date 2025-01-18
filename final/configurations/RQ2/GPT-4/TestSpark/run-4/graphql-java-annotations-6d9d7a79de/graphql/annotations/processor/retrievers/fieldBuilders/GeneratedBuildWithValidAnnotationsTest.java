package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Before;
import org.junit.Test;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;

import java.lang.reflect.Field;
import java.lang.annotation.Annotation;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedBuildWithValidAnnotationsTest {

    private Field field;
    private ProcessingElementsContainer container;
    private DirectivesBuilder directivesBuilder;

    @Before
    public void setUp() {
        field = mock(Field.class);
        container = mock(ProcessingElementsContainer.class);
        directivesBuilder = new DirectivesBuilder(field, container);
    }

    @Test
    public void buildWithValidAnnotationsTest() {
        Annotation[] annotations = {Mockito.mock(Annotation.class), Mockito.mock(Annotation.class)};
        when(field.getAnnotations()).thenReturn(annotations);
        // Assuming that build() method will return the same annotation array length for this case
        int expectedLength = annotations.length;
        int actualLength = directivesBuilder.build().length;
        assertEquals(expectedLength, actualLength);
    }

}