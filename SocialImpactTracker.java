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

