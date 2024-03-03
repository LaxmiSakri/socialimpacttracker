public static void main(String[] args) {
        System.out.println("Welcome to the Social Impact Tracker!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add social impact of an event");
            System.out.println("2. View total social impact");
            System.out.println("3. View individual event impact");
            System.out.println("4. List all events");
            System.out.println("5. Add event description");
            System.out.println("6. List event participants");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addSocialImpact();
                    break;
                case 2:
                    viewTotalSocialImpact();
                    break;
                case 3:
                    viewIndividualEventImpact();
                    break;
                case 4:
                    listAllEvents();
                    break;
                case 5:
                    addEventDescription();
                    break;
                case 6:
                    listEventParticipants();
                    break;
                case 7:
                    System.out.println("Exiting program. Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
