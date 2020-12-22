package by.epam.training.javaWEB.task02.dao.impl.reader;

import by.epam.training.javaWEB.task02.entity.Appliance;
import by.epam.training.javaWEB.task02.service.validation.Validator;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ApplianceTXTReader implements ApplianceReader{
    @Override
    public List<String> read(String path) throws IOException {
        List <String> applianceList = new ArrayList<>();
        if (!Validator.TXTPathValidator(path)) {
            throw new IllegalArgumentException("Illegal file path");
        }
        File file = new File(path);
        if (!file.exists()) {
            throw new IllegalStateException("File is empty");
        }
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String readString = reader.readLine();
        while (readString != null) {
            applianceList.add(readString);
            readString = reader.readLine();
        }
        return applianceList;
    }
}
