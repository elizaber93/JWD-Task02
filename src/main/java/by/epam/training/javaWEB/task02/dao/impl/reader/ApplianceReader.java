package by.epam.training.javaWEB.task02.dao.impl.reader;

import by.epam.training.javaWEB.task02.entity.Appliance;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface ApplianceReader {
    public List<String> read(String path) throws IOException;
}
