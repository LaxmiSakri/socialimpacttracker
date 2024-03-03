import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class SocialImpactTracker {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<String, Integer> socialImpactMap = new HashMap<>();
    private static Map<String, List<String>> eventParticipants = new HashMap<>();
    private static Map<String, String> eventDescriptions = new HashMap<>();
    private static List<String> events = new ArrayList<>();

    private static void addSocialImpact() {
        System.out.print("Enter the name of the event: ");
        scanner.nextLine(); // Consume newline
        String eventName = scanner.nextLine();
        
        System.out.print("Enter the social impact of the event: ");
        int impact = scanner.nextInt();
        
        if (socialImpactMap.containsKey(eventName)) {
            int existingImpact = socialImpactMap.get(eventName);
            socialImpactMap.put(eventName, existingImpact + impact);
        } else {
            socialImpactMap.put(eventName, impact);
            events.add(eventName);
        }
        
        System.out.print("Enter the number of participants: ");
        int numParticipants = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        List<String> participants = new ArrayList<>();
        for (int i = 0; i < numParticipants; i++) {
            System.out.print("Enter participant " + (i + 1) + ": ");
            participants.add(scanner.nextLine());
        }
        eventParticipants.put(eventName, participants);
        
        System.out.println("Social impact added successfully!");
    }
    private static void viewTotalSocialImpact() {
        int totalImpact = 0;
        for (int impact : socialImpactMap.values()) {
            totalImpact += impact;
        }
        System.out.println("Total social impact: " + totalImpact);
    }

    private static void viewIndividualEventImpact() {
        System.out.print("Enter the name of the event: ");
        scanner.nextLine(); // Consume newline
        String eventName = scanner.nextLine();
        
        if (socialImpactMap.containsKey(eventName)) {
            System.out.println("Social impact of " + eventName + ": " + socialImpactMap.get(eventName));
        } else {
            System.out.println("Event not found.");
        }
    }