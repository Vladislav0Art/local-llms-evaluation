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

public class GeneratedBuildEmptyMethodAnnotationsTest {

    @Test
    public void buildEmptyMethodAnnotationsTest() {
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        Method annotatedElement = Mockito.mock(Method.class);
        Mockito.when(annotatedElement.getAnnotations()).thenReturn(new Annotation[0]);

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(annotatedElement, container);
        GraphQLDirective[] directives = directivesBuilder.build();

        Assert.assertNotNull(directives);
        // Array should be empty as there are no Annotations in the Method
        Assert.assertEquals(0, directives.length);
    }

}