package exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
class App {
    public static void save(Path path, Car car) throws IOException {
        String serializeCar = car.serialize();
        Files.writeString(path, serializeCar);
    }

    public static Car extract(Path path) throws IOException {
        String json = Files.readString(path);
        return Car.deserialize(json);
    }
}
// END
