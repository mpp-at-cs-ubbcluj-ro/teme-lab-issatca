package ro.mpp2024.Repository;

public class RepositoryException extends RuntimeException {
    public RepositoryException(){}

    public RepositoryException(String message){
        super(message);
    }
    public RepositoryException(Exception ex){
        super(ex);
    }
}
