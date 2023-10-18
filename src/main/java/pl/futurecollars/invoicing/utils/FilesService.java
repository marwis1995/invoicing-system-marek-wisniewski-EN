package pl.futurecollars.invoicing.utils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FilesService {

  public void appendLineToFile(Path path, String line) throws IOException {
    Files.write(path, (line + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
  }

  public void writeToFile(Path path, String line) throws IOException {
    Files.write(path, line.getBytes(), StandardOpenOption.TRUNCATE_EXISTING);
  }

  public void writeLinesToFile(Path path, List<String> lines) throws IOException {
    Files.write(path, lines, StandardOpenOption.TRUNCATE_EXISTING);
  }

  public List<String> readAllLines(Path path) throws IOException {
    InputStream inputStream = new FileInputStream("xyz.json");
//    Reader reader = new InputStreamReader(inputStream); //Adapter
    BufferedInputStream bis = new BufferedInputStream(inputStream); //Decorator

    return Files.readAllLines(path);
  }

}
