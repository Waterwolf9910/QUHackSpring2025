package com.waterwolfies.quhackspring2025;

import java.io.File;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.List;

import com.google.gson.Gson;

public class Refs {
    private static Gson gson = new Gson();

    public static Schedule schedule;
    public static List<String> activities;
    public static List<String> names;

    static {
        try {
            schedule = gson.fromJson(
                new InputStreamReader(Refs.class.getResourceAsStream("/schedules.json")), Schedule.class);
            activities = Files.readAllLines(new File(Refs.class.getResource("/activities.txt").toURI()).toPath());
            names = Files.readAllLines(new File(Refs.class.getResource("/names.txt").toURI()).toPath());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
