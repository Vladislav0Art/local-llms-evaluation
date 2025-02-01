package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.retrievers.fieldBuilders.Builder;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class GeneratedBuildWhenDirectiveRegistryDoesNotContainDirectiveTest {

    @Test
    public void buildWhenDirectiveRegistryDoesNotContainDirectiveTest() {
        Class<?> mockClass = Mockito.mock(Class.class);
        Annotation mockAnnotation = Mockito.mock(Annotation.class);
        Mockito.when(DirectiveJavaAnnotationUtil.getDirectiveAnnotations(mockClass)).thenReturn(Collections.singletonList(mockAnnotation));

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(mockClass, new ProcessingElementsContainer());
        GraphQLDirective[] result = directivesBuilder.build();

        assertArrayEquals(new GraphQLDirective[0], result);
    }

}