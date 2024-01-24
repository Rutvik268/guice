package rutvik.Guice;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Injector injector = Guice.createInjector(new TextEditorModule());
       TextEditor editor = injector.getInstance(TextEditor.class);
       editor.makeSpellCheck();
    }
}
