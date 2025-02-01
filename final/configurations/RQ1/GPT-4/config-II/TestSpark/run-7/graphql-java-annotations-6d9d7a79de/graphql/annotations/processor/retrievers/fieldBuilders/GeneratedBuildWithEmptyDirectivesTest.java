package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildWithEmptyDirectivesTest {

    @Mock
    private AnnotatedElement object;

    @Mock
    private ProcessingElementsContainer container;

    @Test
    public void buildWithEmptyDirectivesTest() {
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        when(object.getAnnotations()).thenReturn(new Annotation[]{});
        when(container.getDirectiveRegistry()).thenReturn(new HashMap<>());
        assertEquals(0, directivesBuilder.build().length);
    }

}