package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLDirective;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTest {

    private DirectivesBuilder directivesBuilder;
    private AnnotatedElement object;
    private ProcessingElementsContainer container;

    @Before
    public void setUp() {
        object = Mockito.mock(AnnotatedElement.class);
        container = Mockito.mock(ProcessingElementsContainer.class);
        directivesBuilder = new DirectivesBuilder(object, container);
    }

    @Test
    public void testBuildWithoutDirectives() {
        //given
        Mockito.when(object.getAnnotation(Mockito.any())).thenReturn(null);
        Mockito.when(container.getDirectiveRegistry().get(Mockito.anyString())).thenReturn(null);

        //when
        GraphQLDirective[] graphQLDirectives = directivesBuilder.build();

        //then
        assertEquals(0, graphQLDirectives.length);
    }

}