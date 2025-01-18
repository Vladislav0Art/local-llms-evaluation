package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GeneratedBuildValidObjectTest {

    @Test
    public void buildValidObjectTest() {
        Field field = Mockito.mock(Field.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectiveJavaAnnotationUtil directiveJavaAnnotationUtil = Mockito.mock(DirectiveJavaAnnotationUtil.class);
        Mockito.when(container.getDirectiveJavaAnnotationUtil()).thenReturn(directiveJavaAnnotationUtil);
        GraphQLDirectives graphQLDirectives = Mockito.mock(GraphQLDirectives.class);
        GraphQLDirective graphQLDirective = newDirective().name("sampleDirective").build();
        Mockito.when(directiveJavaAnnotationUtil.getGraphQLDirective(Mockito.any(), Mockito.eq(graphQLDirectives))).thenReturn(graphQLDirective);
        Mockito.when(field.getAnnotations()).thenReturn(new Annotation[]{graphQLDirectives});

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(field, container);
        GraphQLDirective[] directives = directivesBuilder.build();

        Assert.assertTrue(directives.length == 1);
        Assert.assertEquals("sampleDirective", directives[0].getName());
    }

}