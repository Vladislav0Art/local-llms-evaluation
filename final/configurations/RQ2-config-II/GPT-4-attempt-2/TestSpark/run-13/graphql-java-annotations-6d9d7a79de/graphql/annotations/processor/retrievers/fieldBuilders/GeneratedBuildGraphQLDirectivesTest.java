package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

public class GeneratedBuildGraphQLDirectivesTest {

    @Test
    public void buildGraphQLDirectivesTest() {
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        Annotation annotation = Mockito.mock(GraphQLDirectives.class);
        Method annotatedElement = Mockito.mock(Method.class);
        Mockito.when(annotatedElement.getAnnotations()).thenReturn(new Annotation[]{annotation});

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(annotatedElement, container);
        GraphQLDirective[] directives = directivesBuilder.build();

        Assert.assertNotNull(directives);
    }

}