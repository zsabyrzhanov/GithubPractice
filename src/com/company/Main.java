package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    public static final GsonBuilder BUILDER = new GsonBuilder();
    public static final Gson GSON = BUILDER.setPrettyPrinting().create();
    public static final Path WRITE_PATH = Paths.get("./cars.json");

    public static void main(String[] args) {

//        Car[] cars = {
//                Car.makeCar("Хонда Инспайр", 6000, Type.SEDAN),
//                Car.makeCar("Хонда СРВ", 9000, Type.ALL_ROAD),
//                Car.makeCar("Хонда Трак-вагон", 12000, Type.TRUCK)
//        };
//        String allCars = GSON.toJson(cars);
//        write(allCars);
//        System.out.println(allCars);
//        System.out.println(readFile());
//
//        Car[] cars1 = GSON.fromJson(readFile(),Car[].class);
//        for (Car c:cars1
//             ) {
//            System.out.println(c.toString());
//        }

        System.out.println(" Hello from new  branch !!!!");
    }

    private static void write(String obj) {
        Path write = Paths.get(String.valueOf(WRITE_PATH));
        try {
            Files.writeString(write, obj, StandardOpenOption.CREATE,
                    StandardOpenOption.WRITE);
        } catch (IOException e) {
            e.getMessage();
        }
    }

    private static String readFile() {
        String json = "";
        try {
            FileReader fr = new FileReader(String.valueOf(WRITE_PATH));
            int a;
            while ((a = fr.read()) != -1) {
                json += (char) a;
            }
            return json;
        } catch (IOException e) {
            e.getMessage();
        }
        return json;
    }
}
