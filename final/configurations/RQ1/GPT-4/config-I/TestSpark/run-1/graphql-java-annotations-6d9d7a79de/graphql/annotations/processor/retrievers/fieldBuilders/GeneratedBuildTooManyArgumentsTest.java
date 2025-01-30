package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

import static org.mockito.Mockito.*;

public class GeneratedBuildTooManyArgumentsTest {

    @Test
    public void buildTooManyArgumentsTest() {
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        GraphQLDirective mockDirective = Mockito.mock(GraphQLDirective.class);
        AnnotatedElement annotatedElement = Mockito.mock(AnnotatedElement.class);
        Annotation annotation = getMockDirectiveAnnotationWithMethods(2);
        when(mockDirective.getArguments()).thenReturn(Collections.singletonList(Mockito.mock(GraphQLArgument.class)));
        when(annotatedElement.getAnnotations()).thenReturn(new Annotation[]{annotation});
        when(container.getDirectiveRegistry().containsKey(any())).thenReturn(true);
        when(container.getDirectiveRegistry().get(any())).thenReturn(mockDirective);

        new DirectivesBuilder(annotatedElement, container).build();
    }

}