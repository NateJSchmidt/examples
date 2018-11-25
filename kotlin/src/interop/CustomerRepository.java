package interop;

import classes.CustomerJava;

import java.util.List;

public interface CustomerRepository {
    CustomerJava getById(int id);
    List<CustomerJava> getAll();
}
