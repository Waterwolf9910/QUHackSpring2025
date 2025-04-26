package com.waterwolfies.quhackspring2025;


import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

public class Schedule {
    
    public List<String> schedule_list;
    public Map<String, Personality> personality_list;

    public static class Personality {
        List<Integer> bad;
        List<Integer> good;

        public Personality() {
        }

        public Personality(List<Integer> bad, List<Integer> good) {
            this.bad = bad;
            this.good = good;
        }
    }
    private Schedule() {}
    // public List<String> schedule_list;
    // public List<Integer> matches;

    // public Schedule() {
        // var raw = new Raw();
        // raw.personality_lists = new HashMap<>();
        // raw.schedule_list = new ArrayList<>();
        // var p = new Raw.Personality();
        // p.good = new ArrayList<>();
        // p.bad = new ArrayList<>();
        // p.good.add(0);
        // p.good.add(1);
        // p.bad.add(2);
        // p.bad.add(3);
        // raw.personality_lists.put("Hello", p);
        // System.out.println(gson.toJson(raw));
    //     Raw a = gson.fromJson(new InputStreamReader(getClass().getResourceAsStream("/schedules.json")), Raw.class);
    //     System.out.println("Works!");
    // }

    // private static Gson gson = new GsonBuilder().registerTypeAdapter(Raw.class, new JsonDeserializer<Raw>() {
    //     @Override
    //     public Raw deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
    //         Raw raw = new Raw();
    //         var obj = json.getAsJsonObject();
    //         raw.personality_lists = context.deserialize(obj.getAsJsonObject("personality_lists"), Map.class);
    //         raw.schedule_list = context.deserialize(obj.getAsJsonObject("schedule_list"), typeOfT);
    //         return raw;
    //     }
    // }).create();
}
