private static void listAllEvents() {
        System.out.println("List of all events:");
        for (String event : events) {
            System.out.println(event);
        }
    }

    private static void addEventDescription() {
        System.out.print("Enter the name of the event: ");
        scanner.nextLine(); // Consume newline
        String eventName = scanner.nextLine();
        
        System.out.print("Enter the description of the event: ");
        String description = scanner.nextLine();
        
        eventDescriptions.put(eventName, description);
        System.out.println("Event description added successfully!");
    }

    private static void listEventParticipants() {
        System.out.print("Enter the name of the event: ");
        scanner.nextLine(); // Consume newline
        String eventName = scanner.nextLine();
        
        if (eventParticipants.containsKey(eventName)) {
            System.out.println("Participants of " + eventName + ":");
            for (String participant : eventParticipants.get(eventName)) {
                System.out.println(participant);
            }
        } else {
            System.out.println("Event not found.");
        }
    }
}
