package unidue.rcc.backend.test.env;

import java.util.Map;

import unidue.rcc.backend.exception.DatabaseException;

public interface CayenneTestService {

    public void setupdb(Map<String, String> dbproperties) throws DatabaseException;
}
