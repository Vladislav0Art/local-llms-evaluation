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

public class GeneratedBuildNoDirectiveInRegistryTest {

    @Test
    public void buildNoDirectiveInRegistryTest() {
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        AnnotatedElement annotatedElement = Mockito.mock(AnnotatedElement.class);
        Annotation annotation = Mockito.mock(Annotation.class);
        when(annotatedElement.getAnnotations()).thenReturn(new Annotation[]{annotation});

        new DirectivesBuilder(annotatedElement, container).build();
    }

}