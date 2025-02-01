package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

import static graphql.schema.GraphQLDirective.newDirective;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuild_DirectiveNotInRegistry_ExceptionThrown {

    @Mock
    AnnotatedElement object;

    @Mock
    ProcessingElementsContainer container;

    @Test
    public void build_DirectiveNotInRegistry_ExceptionThrown() {
        when(DirectiveJavaAnnotationUtil.getDirectiveAnnotations(object)).thenReturn(Arrays.asList(TestDirectiveAnnotation.class));
        when(container.getDirectiveRegistry().containsKey("test")).thenReturn(false);
        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        try {
            builder.build();
            fail("Expected exception not thrown");
        } catch (GraphQLAnnotationsException e) {
            assertEquals("No directive named test is found in the directive registry", e.getMessage());
        }
    }

}