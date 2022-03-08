package exceptionsErrorLecture;

public class ExceptionsTest {

    public static void testMethod() {
        System.out.println("A method to do something else in the catch");
    }

    public static void main(String[] args) throws Exception {

        System.out.println("If I'm above the exception, will I be seen?");

        // TRY-CATCH BLOCK

        try {
            // Code to break the application
            throw new Exception(" Something broke while running the application!");
        } catch (NullPointerException exceptionObject) {
            System.out.println("This is a null pointer exception");
            System.out.println("Here's an example of .getMessage()" + exceptionObject.getMessage());
            exceptionObject.printStackTrace();
        } catch (RuntimeException exceptionObject) {
            System.out.println("This is a runtime exception");
            System.out.println("Here's an example of .getMessage()" + exceptionObject.getMessage());
            exceptionObject.printStackTrace();
        } catch (Exception exceptionObject) {
            System.out.println("This is a generic, top level exception");
            System.out.println("Here's an example of .getMessage()" + exceptionObject.getMessage());
            exceptionObject.printStackTrace();
            ExceptionsTest.testMethod();
        }
    }
}
