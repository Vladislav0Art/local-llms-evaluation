package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLDirective;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildWithSingleDirectiveTest {

    @Test
    public void buildWithSingleDirectiveTest() {
        Method method = Mockito.mock(Method.class);
        Annotation annotation = Mockito.mock(Annotation.class);
        when(method.getDeclaredAnnotations()).thenReturn(new Annotation[]{annotation});
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(method, null);

        DirectiveJavaAnnotationUtil directiveJavaAnnotationUtil = Mockito.mock(DirectiveJavaAnnotationUtil.class);
        when(directiveJavaAnnotationUtil.getUsageDirectiveInfo(method)).thenReturn(annotation);

        GraphQLDirective directive = new GraphQLDirective();
        when(directiveJavaAnnotationUtil.createDirectiveWiring(any())).thenReturn(directive);

        GraphQLDirective[] directives = directivesBuilder.build();

        assertEquals(1, directives.length);
        assertEquals(directive, directives[0]);
    }

}