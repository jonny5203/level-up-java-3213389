package com.linkedin.javacodechallenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class App {
    public static List<String> findStudentsWithIncompleteVolunteerEvents(List<String> students,
            Map<String, List<String>> attendeesMapping) {
        // Put all attendies in a hashset
        Set<String> allAttendees = new HashSet<>();

        // Iterate through attendees for each event and add them to the set
        for (List<String> attendees : attendeesMapping.values()) {
            allAttendees.addAll(attendees);
        }

        // List to store students that have less than 2 attendance
        List<String> incompleteStudents = new ArrayList<>();

        // Map to store attendance count for each student
        Map<String, Integer> attendanceCount = new HashMap<>();

        // Count attendances for each student, by every counting every
        // student in attendeesMapping map
        for (String student : students) {
            for (List<String> attendees : attendeesMapping.values()) {
                if (attendees.contains(student)) {
                    attendanceCount.put(student, attendanceCount.getOrDefault(student, 0) + 1);
                }
            }
        }

        // Check if any student name has less than 2 attendance
        // and add to incompleteStudents list
        for (String student : students) {
            if (attendanceCount.getOrDefault(student, 0) < 2) {
                incompleteStudents.add(student);
            }
        }

        return incompleteStudents;
    }

    public static void main(String[] args) {
        List<String> students = List.of("Sally", "Polly", "Molly",
                "Tony", "Harry");

        Map<String, List<String>> attendeesMapping = Map.of("Farmer's Market", List.of("Sally", "Polly"),
                "Car Wash Fundraiser", List.of("Molly", "Tony", "Polly"),
                "Cooking Workshop", List.of("Sally", "Molly", "Polly"),
                "Midnight Breakfast", List.of("Polly", "Molly"));

        System.out.println(findStudentsWithIncompleteVolunteerEvents(
                students, attendeesMapping));
    }

}
