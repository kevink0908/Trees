public class EmptyTreeException extends RuntimeException
{
    public EmptyTreeException()
    {
        this(null);
    } // end of default constructor

    public EmptyTreeException(String message)
    {
        super(message);
    } // end of type constructor
} // end of "EmptyTreeException" class
