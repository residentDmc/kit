package SinglResponsibility;

public class CustomersRepository {

    FileLogger logger = new FileLogger();
    public void Add() {
        try {
            // add customer to database
        } catch (Exception ex) {
            logger.Log(ex.getMessage());
        }
    }
}
